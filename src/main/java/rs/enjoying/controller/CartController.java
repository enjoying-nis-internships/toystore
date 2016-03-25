package rs.enjoying.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import rs.enjoying.data.ProductData;
import rs.enjoying.data.UserData;
import rs.enjoying.model.Cart;
import rs.enjoying.model.CartEntry;
import rs.enjoying.model.User;
import rs.enjoying.service.ProductService;
import rs.enjoying.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
@Scope("session")
public class CartController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String getCart(Model model, HttpServletRequest request)
	{
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		ArrayList<ProductData> products = new ArrayList<ProductData>();
		
		double total = 0;
		for(CartEntry ce : cart.getEntries())
		{
			ProductData pd = productService.getProductForId((long)ce.getProductId());
			ce.setProductData(pd);
			
			total += ce.getProductData().getPrice();
		}
		
		model.addAttribute("cart", cart.getEntries());
		model.addAttribute("total", total);
		
		return "cart";
	}

	@RequestMapping(value = "/cart/add", method = RequestMethod.POST)
	public @ResponseBody String addToCart(HttpServletRequest request, 
			@RequestParam("productId") String pId,
			@RequestParam("quantity") String q)
	{
		Integer productId = Integer.parseInt(pId);
		Integer quantity = Integer.parseInt(q);
		
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		if(cart == null)
		{
			cart = new Cart();
			cart.add(new CartEntry(productId, quantity));
		}
		else
		{
			boolean found = false;
			ArrayList<CartEntry> entries = (ArrayList<CartEntry>) cart.getEntries();
			for(int i = 0; i < entries.size(); i++)
			{
				if(entries.get(i).getProductId() == productId)
				{
					found = true;
					break;
				}
			}
			
			if(!found) cart.add(new CartEntry(productId, quantity));
		}
		
		request.getSession().setAttribute("cart", cart);
		
		return "gg";
	}
	
	@RequestMapping(value = "/cart/setQuantity", method = RequestMethod.POST)
	public @ResponseBody String setQuantity(HttpServletRequest request, 
			@RequestParam("productId") String pId,
			@RequestParam("quantity") String q)
	{
		Integer productId = Integer.parseInt(pId);
		Integer quantity = Integer.parseInt(q);
		
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		if(cart == null)
		{
			return "";
		}
		
		ArrayList<CartEntry> entries = (ArrayList<CartEntry>) cart.getEntries();
		for(int i = 0; i < entries.size(); i++)
		{
			if(entries.get(i).getProductId() == productId)
			{
				entries.get(i).setQuantity(quantity);
				break;
			}
		}
		
		request.getSession().setAttribute("cart", cart);
		
		return "gg";
	}
	
	@RequestMapping(value = "/cart/remove", method = RequestMethod.POST)
	public @ResponseBody String removeFromCart(HttpServletRequest request, 
			@RequestParam("productId") String pId)
	{
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		
		for(int i = 0; i < cart.getEntries().size(); i++)
		{
			if(cart.getEntries().get(i).getProductId() == Integer.parseInt(pId))
			{
				cart.remove(cart.getEntries().get(i));
			}
		}
		
		request.getSession().setAttribute("cart", cart);
		
		return "gg";
	}
}