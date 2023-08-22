package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started");
        //spring jdbc =>JdbcTemplate
//    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//    	INSERT
//    	Student student =new Student();
//    	student.setId(666);
//    	student.setName("John");
//    	student.setCity("Lucknow");
//    	
//    	int result = studentDao.insert(student);
//    	System.out.println("student added="+result);
    	
//    	UPDATE
//    	Student student =new Student();
//    	student.setId(456);
//    	student.setName("Raj Kumar");
//    	student.setCity("Lucknow");
//    	
//    	int result1=studentDao.change(student);
//    	System.out.println("data changed="+result1);
    	
//    	DELETE

//    	int result2=studentDao.delete(456);
//    	System.out.println("deleted data="+result2);
    	
//		selecting single row/object
//    	Student student=studentDao.getStudent(222);
//    	System.out.println(student);
    	
//    	selecting multiple row/object
    	List<Student> student=studentDao.getAllStudent();
    	for(Student s:student)
    	{
    		System.out.println(s);
    	}
//    	System.out.println(student);
    }
}
