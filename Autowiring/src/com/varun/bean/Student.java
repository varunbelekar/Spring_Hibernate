package com.varun.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;

	private Hostel hostel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	
	public String dispay() {
		return ""+getId()+" "+getName()+" "+getHostel().getCity()+" "+getHostel().getHostelName();
	}
	
	
	
	
}
