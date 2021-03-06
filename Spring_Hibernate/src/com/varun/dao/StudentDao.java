package com.varun.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.varun.model.Student;

public class StudentDao {
	
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public void saveStudent(Student s){
		template.save(s);
	}
	
	public List<Student> listStudent(){
		List<Student> list=new ArrayList<Student>();
		list =template.loadAll(Student.class);
		return list;
	}
	
	public void deleteStudent(int id){
		Student s=template.load(Student.class, id);
		template.delete(s);
	}
	
	public void updateStudent(Student s){
		template.saveOrUpdate(s);
		
	}
	public List<Student> checkLogin(String username,String password){
		String query="from Student where username='"+username+"'";
		query+=" and password='"+password+"'";
		System.out.println(query);
		List<Student> st=template.find(query);
		return st;
	}
}
