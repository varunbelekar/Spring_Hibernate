package com.varun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varun.model.Student;
import com.varun.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService student;
	
	@RequestMapping("/add")
	public ModelAndView addStudent(){
		System.out.println("hello");
		return new ModelAndView("addStudentForm","command",new Student());
	}
	
	@RequestMapping("/processForm")
	public ModelAndView saveStudent(@ModelAttribute("student")Student s,Model model){
		System.out.println(s.getName());
		student.saveStudentService(s);
		model.addAttribute("stud",s);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("/view")
	public ModelAndView viewStudent(){
		List<Student> list=student.viewStudentService();
		return new ModelAndView("viewStudent","list",list);
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteStudent(@PathVariable int id){
		student.deleteStudentService(id);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("/update")
	public ModelAndView updateStudent(){
		return new ModelAndView("editForm","command",new Student());
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudent(@ModelAttribute("stud") Student s){
		student.updateStudentService(s);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("/home")
	public ModelAndView home(){
		return new ModelAndView("home");
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginPage(){
		return new ModelAndView("loginPage","command",new Student());
	}
	
	@RequestMapping("/loginAttempt")
	public ModelAndView checkLogin(@ModelAttribute("student")Student s){
		List<Student> st=student.checkLoginService(s.getUsername(),s.getPassword());
		if(st.size()==0){
			return new ModelAndView("failLogin");
		}
		return new ModelAndView("loginsuccess","student",s);
	}
}
