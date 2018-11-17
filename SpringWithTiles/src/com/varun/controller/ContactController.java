package com.varun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.varun.model.Contact;

@Controller
public class ContactController {
	@RequestMapping("/hello")
	public ModelAndView hello(){
		String message="Hello Spring";
		return new ModelAndView("hello","mess",message);
	}
	
	
	@RequestMapping("/contact")
	public ModelAndView contact(){
		return new ModelAndView("contact","command",new Contact());
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")Contact con,BindingResult result){
		
		return "redirect:contact.html";
	}
	
	
}
