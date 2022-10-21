package com.tmf.sms.service;
import java.util.*;
import com.tmf.sms.dao.*;
public interface Smsservices {
	StudentDAO dao=new StudentDAOimpl();
Scanner Scan =new Scanner(System.in);
void registerStudent();
void displayStudent();
void displayStudentid();
void menu();

}
