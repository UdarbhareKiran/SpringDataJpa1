package com.example.demo.model;

public class Student {
	
	private int Sid;
	private String Sname;
	private String Sschool;
	private String Sclass;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSschool() {
		return Sschool;
	}
	public void setSschool(String sschool) {
		Sschool = sschool;
	}
	public String getSclass() {
		return Sclass;
	}
	public void setSclass(String sclass) {
		Sclass = sclass;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sschool=" + Sschool + ", Sclass=" + Sclass + "]";
	}
	
	
	

}
