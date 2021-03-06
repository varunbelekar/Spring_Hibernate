package com.varun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varun.model.Employee;
import com.varun.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping("/add")
	public ModelAndView showForm(){
		return new ModelAndView("employeeForm","command",new Employee());
	}
	
	
	@RequestMapping(value="/processForm")
	public ModelAndView processForm(@ModelAttribute("employee") Employee e){
		System.out.println(e.getName());
		//EmployeeService obj=new EmployeeService();
		//obj.saveEmployeeService(e);
		empService.saveEmployeeService(e);
		
		return new ModelAndView("viewEmployee","employee",e);
	}
	
	@RequestMapping("/view")
	public ModelAndView showEmployee(){
		List<Employee> list=empService.viewEmployeeService();
		return new ModelAndView("viewEmployee","list",list);
	}
	
	@RequestMapping("/delete/{name}")
	public ModelAndView deleteEmployee(@PathVariable String name){
		empService.deleteEmployeeService(name);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("/edit/{name}")
	public ModelAndView editEmployee(@PathVariable String name){
		Employee e=empService.getEmployeeService(name);
		return new ModelAndView("editForm","command",e);
	}
	
	@RequestMapping("/editsave")
	public ModelAndView updateEmployee(@ModelAttribute("emp") Employee e){
		empService.updateEmployeeService(e);
		return new ModelAndView("redirect:/view");
	}
	
}
