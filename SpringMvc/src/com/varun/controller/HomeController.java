package com.varun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.varun.beans.Student;

@Controller
public class HomeController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("student",new Student());
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String myHomePage(HttpServletRequest request,Model model){
		String name=request.getParameter("name");
		name=name.toUpperCase();
		model.addAttribute("name",name);
		return "home";
	}
	
	
	@RequestMapping("/processForm1")
	public String myHomePagee(@RequestParam("name")String name,Model model)
	//Model is used to pass data between controller and view.
	{
		name=name.toUpperCase();
		model.addAttribute("name",name);
		return "home";
	}
	
	@RequestMapping("/processForm2")
	public String myHomePageee(@ModelAttribute("student")Student s,Model model){
		System.out.println(s.getFirstName()+" "+s.getLastName()+" "+s.getAge());
		return "home";
	}
}
