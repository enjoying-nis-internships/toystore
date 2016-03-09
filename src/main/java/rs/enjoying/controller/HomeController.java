package rs.enjoying.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.enjoying.data.UserData;
import rs.enjoying.model.User;
import rs.enjoying.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String loadHomePage(HttpServletRequest request) {
		//m.addAttribute("name", "CodeTutr");
		request.setAttribute("name", "Milos");
		return "home";
	}
	
	@RequestMapping("/user")
	public String getUser(HttpServletRequest request) {
		
		UserData user = userService.getById(1L);
		request.setAttribute("user", user);
		return "user";
	}
	@RequestMapping("/registration")
	public String getRegistration(HttpServletRequest request) {
		
		return "registration";
	}
	
}