package rs.enjoying.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.org.apache.bcel.internal.classfile.Attribute;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import javafx.scene.control.Alert;
import rs.enjoying.data.UserData;
import rs.enjoying.model.User;
import rs.enjoying.service.UserService;
import rs.enjoying.validator.UserValidator;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	

	@RequestMapping("/home")
	public String loadHomePage(HttpServletRequest request) {
		// m.addAttribute("name", "CodeTutr");
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
	public String getRegistration(Model model,HttpServletRequest request, HttpServletResponse response) {

		UserData ud = new UserData();

		model.addAttribute("userForm", ud);
		return "registration";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String register(@ModelAttribute("userForm") @Validated UserData user, HttpServletRequest request,
			HttpServletResponse response,BindingResult result) 
	{
	        UserValidator userValidator = new UserValidator();
	        userValidator.validate(user, result);

	        if(result.hasErrors())
	        {	 
	        	return "registration";
	        }
	        else
	        {
	        	userService.create(user);
			
	        }
	        return "redirect:/home";
	       
	
		
	}
}
