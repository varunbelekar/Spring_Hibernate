package com.varun.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Student obj=(Student)b.getBean("Student");
		System.out.println(obj.dispay());
	}
}
