package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
//		Student student=context.getBean("student",Student.class);
		Student student=context.getBean("ob",Student.class);
		System.out.println(student.hashCode());
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		Student student2=context.getBean("ob",Student.class);
		System.out.println(student2.hashCode());
		}

}
