package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudenService {
	
	public int addStudent(Student student);
	public List<Student>getAllStudent();
	public Student getEmployeeById(Student id);
	public Student update(Student student);
	
	 public boolean delete(int uid);
	
	
	
	

}
