package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//    	Student student =new Student(234,"Durgesh Tiwari","Lucknow");
//    	int r=studentDao.insert(student);
//    	System.out.println("Done="+r);
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	outer:while(true)
    	{
    	System.out.println("PRESS 1 FOR add new student");
    	System.out.println("PRESS 2 FOR display all student");
    	System.out.println("PRESS 3 FOR get the detail of single student");
    	System.out.println("PRESS 4 FOR delete student");
    	System.out.println("PRESS 5 FOR update student");
    	System.out.println("PRESS 6 FOR EXIT");
    	try
    	{
    		int choice=Integer.parseInt(br.readLine());
    		switch (choice) {
			case 1:
				//add new student
				//taking input from user
				System.out.println("Enter user id: ");
				int uId=Integer.parseInt(br.readLine());
				System.out.println("Enter user name:");
				String uName=br.readLine();
				System.out.println("Enter user city:");
				String uCity=br.readLine();
				
				//creating student object and setting values
				Student s=new Student();
				s.setStudent_id(uId);
				s.setStudent_name(uName);
				s.setStudent_city(uCity);
				
				//saving student object to database by calling insert of student dao
				int id=studentDao.insert(s);
				System.out.println("Student added Id="+id);
				System.out.println("*****************");
				System.out.println();
				break;
				
			case 2:
				//display all student
				List<Student> allStudent=studentDao.getAllStudent();
				for(Student st:allStudent)
				{
					System.out.println("Name="+st.getStudent_name());
					System.out.println("Id="+st.getStudent_id());
					System.out.println("City="+st.getStudent_city());
					System.out.println("_________________________");
				}
				System.out.println("******************");
				break;
				
			case 3:
				//get the detail of single student
				System.out.println("Enter user id: ");
				int userId=Integer.parseInt(br.readLine());
				Student student=studentDao.getStudent(userId);
				System.out.println("Name="+student.getStudent_name());
				System.out.println("Id="+student.getStudent_id());
				System.out.println("City="+student.getStudent_city());
				System.out.println("___________________________");

				break;
			case 4:
				//delete student
				System.out.println("Enter user id: ");
				int dId=Integer.parseInt(br.readLine());
				studentDao.deleteStudent(dId);
				System.out.println("Student deleted");
				break;
			case 5:
				//update student
				System.out.println("Enter user id: ");
				int updateId=Integer.parseInt(br.readLine());
				Student student11 = studentDao.getStudent(updateId);
				System.out.println("Enter user Name: ");
				String name=br.readLine();
				student11.setStudent_name(name);
				System.out.println("Enter user City: ");
				String city=br.readLine();
				student11.setStudent_city(city);
				studentDao.updateStudent(student11);
				System.out.println("Data Updated");
				System.out.println("________________________");
				break;
			case 6:
				//Exit
				break outer;

			default:
				break;
			}
    	}
    	catch(Exception e)
    	{
    		System.out.println("Invalid Input Try with another one!!");
    		System.out.println(e.getMessage()+"\n");
    		
    	}
    	}
    	System.out.println("Thank you for using my application \n see you soon");
    }
    
}
