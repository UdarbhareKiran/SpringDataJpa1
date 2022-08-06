package com.example.demp.Repository;

import org.springframework.stereotype.Repository;

import com.example.demp.Repository.StudentRepository.JpaRepository;

@Repository
public interface StudentRepository<Student> extends JpaRepository<Student, Integer> {

	public interface JpaRepository<T1, T2> {

	}

}
