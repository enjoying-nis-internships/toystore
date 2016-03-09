package rs.enjoying.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.enjoying.data.ProductData;
import rs.enjoying.service.ProductService;


@Controller
public class ProductController {
	

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/product/list/{categoryId}", method = RequestMethod.GET)
	public String getProductList(@PathVariable Long categoryId, Model model, HttpServletRequest request) {

		List<ProductData> products = productService.getProductsForCategoryId(categoryId);
		model.addAttribute("productList", products);
		
		return "productlist";
	}
	
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
	public String getProduct(@PathVariable Long productId, Model model, HttpServletRequest request)
	{
		ProductData pd = productService.getProductForId(productId);
		model.addAttribute("productDetails", pd);
		
		return "productdetails";
	}
}
