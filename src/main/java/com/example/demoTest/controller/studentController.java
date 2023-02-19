package com.example.demoTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoTest.Repository.StudentRepo;
import com.example.demoTest.model.StudentModel;
import com.example.demoTest.service.StudentService;

@RestController
public class studentController {
	
	@Autowired
	StudentService objStudentService;
	
	@Autowired
	StudentRepo objStudentRepo;
	
	
	@PostMapping("stu/save")
	 public String saveDetails(@RequestBody StudentModel stu) {
		String s=objStudentService.saveRecord(stu);
		return s;
		
	}
	
     @GetMapping("stu/get")
     public List<StudentModel> getDetail() {
    	return objStudentService.getRecord();
    }

	
	

}
