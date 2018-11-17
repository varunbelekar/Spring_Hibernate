package com.varun.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach obj=new CricketCoach(); //TightCoupling
		Coach obj1=new FootBallCoach();//TightCoupling
		//System.out.println(obj.getWorkout());
		//System.out.println(obj1.getWorkout());
		
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Coach c=(Coach)b.getBean("a");
		System.out.println(c.getWorkout());
		
	}

}
