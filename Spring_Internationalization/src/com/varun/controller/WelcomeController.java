package com.varun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/init")
	public ModelAndView getWelcomePage(){
		String welcome="Welcome Varun";
		System.out.println("welcome");
		return new ModelAndView("welcomePage","welcomeMessage",welcome);
	}
}
