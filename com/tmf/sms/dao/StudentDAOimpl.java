package com.tmf.sms.dao;
import java.util.List;

import com.tmf.sms.model.Student;
public class StudentDAOimpl implements StudentDAO{

	@Override
	public void addnewstudent(Student st) {
		// TODO Auto-generated method stub
		students.add(st);
		System.out.println(" your registration has been sucessfully");
		}

	@Override
	public List<Student> displaystudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student displaystudent(int studentid) {
// TODO Auto-generated method stub
		Student st=new Student();
		st.setStudentid(0);
		for(Student s:students) {
			if(s.getStudentid()==studentid) {
				st=s;
				break;
			}
		}
		return st;
		
	}
	

	@Override
	public void displaystudent(Student st) {
		// TODO Auto-generated method stub
		System.out.print(st.getStudentid());
		System.out.print(st.getStudentname());
		System.out.print(st.getStudentemil());
		System.out.print(st.getPhonenumber());

        }
}
