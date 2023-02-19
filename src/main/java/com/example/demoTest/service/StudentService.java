package com.example.demoTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoTest.Repository.StudentRepo;
import com.example.demoTest.model.StudentModel;

@Service
public class StudentService {
	
	
	@Autowired
	StudentRepo objStudentRepo;
	
	
	public String saveRecord(StudentModel stu) {
		
		objStudentRepo.save(stu);
		return "data save succesfully";
		
		
	}


	public List<StudentModel> getRecord() {
		
		return objStudentRepo.findAll();
		
	}


		
	}
	
	


