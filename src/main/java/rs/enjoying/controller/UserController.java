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
import rs.enjoying.data.UserData;
import rs.enjoying.service.ProductService;
import rs.enjoying.service.UserService;

@Controller
public class UserController {
	

	@Autowired
	UserService userService;
	
	/*@RequestMapping(value = "/account/user/", method = RequestMethod.GET)
	public String getUserList(@PathVariable Long userId, Model model, HttpServletRequest request) {

		List<UserData> users = userService.getById(userId);
		model.addAttribute("userList", users);
		
		return "users";
	}*/
	
	@RequestMapping(value = "/account/user/{userId}", method = RequestMethod.GET)
	public String getUser(@PathVariable Long userId, Model model, HttpServletRequest request)
	{
		UserData user = userService.getById(userId);
		model.addAttribute("user", user);
		
		return "userdetails";
	}
}