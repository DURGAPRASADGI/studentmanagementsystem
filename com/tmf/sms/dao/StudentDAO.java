package com.tmf.sms.dao;
import java.util.*;

import com.tmf.sms.model.Student;
public interface StudentDAO {
	List<Student> students=new ArrayList<Student>();
	void addnewstudent(Student st);
	List<Student>displaystudents();
	Student displaystudent(int studentid);
	void displaystudent(Student st);
	
	
	

}
