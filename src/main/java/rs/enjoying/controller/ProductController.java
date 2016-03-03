package rs.enjoying.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;



public class ProductController {
	

	    @RequestMapping("/product/list/{categoryId}")
	    	public String getProductList(HttpServletRequest request) {
	    		request.setAttribute("name", "Product List");
	    		return "productlist";
	    }
		
}
