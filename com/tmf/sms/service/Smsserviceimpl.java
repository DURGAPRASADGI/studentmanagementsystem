package com.tmf.sms.service;
import java.util.List;

import com.tmf.sms.model.*;
public class Smsserviceimpl implements Smsservices{
public static int id=1000001;
	@Override
	public void registerStudent() {
		// TODO Auto-generated method stub
		System.out.println(" enter the student name");
		String name=Scan.next();
		System.out.println(" enter the student phonenumber");
		long phone=Scan.nextLong();
		System.out.println(" enter the student email");
		String email=Scan.next();
		Student st=new Student();
		st.setStudentid(id);
		st.setStudentemil(email);
		st.setPhonenumber(phone);;
		st.setStudentname(name);
		
		dao.addnewstudent(st);
		id++;
}

	@Override
	public void displayStudent() {
		// TODO Auto-generated method stub
		List<Student>students=dao.displaystudents();
		for(Student st:students) {
			dao.displaystudent(st);
		}
		
		
	}

	@Override
	public void displayStudentid() {
		// TODO Auto-generated method stub
		System.out.println("enter the student id");
		int sid=Scan.nextInt();
		Student st =dao.displaystudent(sid);
		if(st.getStudentid()==0) {
			System.out.println("soory it cannot exist");
		}
		else {
			dao.displaystudent(sid);
		}
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("=======menu+===");
			System.out.println("press 1 add new student");
			System.out.println("press 2 displaystudent");
			System.out.println("press 3 displaystudentid");
			System.out.println("press 9 exit");
			System.out.println("please enter your choice");
			int ch=Scan.nextInt();
			switch(ch) {
			case 1:registerStudent();break;
			case 2:displayStudent();break;
			case 3:displayStudentid();break;
			case 9:System.exit(0);
			default: System.out.println(" soory your enter wrong choice");
			}

         }
		
	}

}
