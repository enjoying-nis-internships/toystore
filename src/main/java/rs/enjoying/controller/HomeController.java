package rs.enjoying.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String getRegistration(HttpServletRequest request) {
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String register(HttpServletRequest request,
			@RequestParam("username") String username,
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("cpassword") String cpassword)
	{
		if(username != null && firstname != null && lastname != null && email != null && password != null && cpassword != null)
		{
			if(password.compareTo(cpassword) == 0)
			{
				userService.create(firstname, lastname, email, password, username);
			}
		}

		return "redirect:/home";
	}
}