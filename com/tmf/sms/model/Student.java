package com.tmf.sms.model;

public class Student {
private int studentid;
private String studentname,studentemil,password,address,dob,batchnumber;
private long phonenumber;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentemil() {
	return studentemil;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentemil=" + studentemil
			+ ", password=" + password + ", address=" + address + ", dob=" + dob + ", batchnumber=" + batchnumber
			+ ", phonenumber=" + phonenumber + "]";
}
public void setStudentemil(String studentemil) {
	this.studentemil = studentemil;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getBatchnumber() {
	return batchnumber;
}
public void setBatchnumber(String batchnumber) {
	this.batchnumber = batchnumber;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
}
