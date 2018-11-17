package com.varun.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.varun.model.Employee;

public class EmployeeDAO {
	JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public void saveEmployee(Employee e){
		System.out.println(e.getName());
		String sql="insert into Emp99(Name,Age,Designation) values";
		sql+="('"+e.getName()+"'";
		sql+=","+e.getAge();
		sql+=",'"+e.getDesignation()+"')";
		System.out.println(sql);
		
		template.update(sql);
	}
	
	public List<Employee> viewEmployee(){
		
		return template.query("select * from emp99", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e=new Employee();
				e.setAge(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDesignation(rs.getString(3));
				return e;
			}
		});
	}
	
	public void deleteEmployee(String name){
		String sql="delete from emp99 where name='"+name+"'";
		System.out.println(sql);
		template.update(sql);
	}
	
	public void updateEmployee(Employee e){
		String sql="update emp99 set name='"+e.getName()+"'";
		sql+=",age="+e.getAge();
		sql+=",designation='"+e.getDesignation()+"'";
		template.update(sql);
	}
	
	public Employee getEmployee(String name){
		String sql="select * from emp99 where name='"+name+"'";
		return template.queryForObject(sql, new Object[]{name},new BeanPropertyRowMapper<Employee>(Employee.class));
	}
}
