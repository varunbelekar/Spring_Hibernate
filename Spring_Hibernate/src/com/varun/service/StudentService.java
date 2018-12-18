package com.varun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varun.dao.StudentDao;
import com.varun.model.Student;

import oracle.net.aso.e;

public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public void saveStudentService(Student s){
		dao.saveStudent(s);
	}
	
	public List<Student> viewStudentService(){
		return dao.listStudent();
	}
	
	public void deleteStudentService(int id){
		dao.deleteStudent(id);
	}
	
	public void updateStudentService(Student s){
		dao.updateStudent(s);
	}
	
	public List<Student> checkLoginService(String username,String password){
		return dao.checkLogin(username,password);
	}
}
