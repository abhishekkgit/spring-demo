package com.example.demoTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoTest.model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

	

}
