package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {

		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource( "Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
