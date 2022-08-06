package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demp.Repository.StudentRepository;

public class StudentServiceImpl implements StudenService {
      @Autowired
     StudentRepository studentRepository;
	@Override
	public int addStudent(Student student) {
		Student save=studentRepository.save(student);
		return 0;
	}

	@Override

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getEmployeeById(Student id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Student> getallStudent(Student Integer) {
		// TODO Auto-generated method stub
		return null;
	}


}
