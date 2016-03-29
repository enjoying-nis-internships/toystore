package rs.enjoying.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.enjoying.converter.AddressConverter;
import rs.enjoying.converter.ProductConverter;
import rs.enjoying.converter.UserConverter;
import rs.enjoying.data.AddressData;
import rs.enjoying.data.OrderData;
import rs.enjoying.data.OrderEntryData;
import rs.enjoying.data.ProductData;
import rs.enjoying.data.UserData;
import rs.enjoying.model.Address;
import rs.enjoying.model.Cart;
import rs.enjoying.model.CartEntry;
import rs.enjoying.model.User;
import rs.enjoying.service.AddressService;
import rs.enjoying.service.OrderEntryService;
import rs.enjoying.service.OrderService;
import rs.enjoying.service.ProductService;
import rs.enjoying.service.UserService;

@Controller
public class OrderController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserConverter userConverter;
	
	@Autowired
	AddressConverter addressConverter;
	
	@Autowired
	OrderEntryService orderEntryService;
	
	@RequestMapping(value = "/order/checkout", method = RequestMethod.GET)
	public String addOrder(Model model, HttpServletRequest request)
	{
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		ArrayList<ProductData> products = new ArrayList<ProductData>();
		
		if(cart == null || cart.getEntries().size() == 0)  
		{
			cart = new Cart();
			return "redirect:/cart";
		}
		else
		{
			double total = 0;		
			OrderData order = new OrderData();
			ArrayList<OrderEntryData> orderEntries = new ArrayList<OrderEntryData>();
			
			UserData u = userService.getById(1);
			User user = new User();
			userConverter.copyFromDataToEntity(u, user);
			
			order.setUser(user);// dzast testin mejt
			
			for(CartEntry ce : cart.getEntries())
			{
				ProductData pd = productService.getProductForId(Long.valueOf(ce.getProductId()));
				
				OrderEntryData oed = new OrderEntryData();
				oed.setOrder(order);
				oed.setProduct(pd);
				oed.setQuantity(ce.getQuantity());
				
				total += pd.getPrice() * ce.getQuantity();
				
				orderEntries.add(oed);
			}
			
			order.setTotalPrice(total);
			
			Address address = addressService.findByUserId(user.getId());
			
			order.setAddress(address);
			
			orderService.createOrder(order);
			
			for(OrderEntryData oed : orderEntries)
			{
				orderEntryService.saveOrderEntry(oed);
			}
		}
		
		return "redirect:/cart";
	}

}
