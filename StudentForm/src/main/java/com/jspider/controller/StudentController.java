package com.jspider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.entity.Student;
import com.jspider.service.Studentservice;

@RestController
public class StudentController 
{
	 @Autowired
	 private Studentservice services;
	 
	 @GetMapping("/getall")
	 public Iterable<Student>getStudents() 
	 {
		 return services.listAll();     
	 }

	 @PostMapping(value = "/save")
	 private long saveBook(@RequestBody Student students)   
	 {  
		 services.saveOrUpdate(students);  
		 return  students.getId();  
	 }
	   
	
	 @GetMapping("/student/{id}")  
	 private Student getBooks(@PathVariable(name = "id") int studentid)   
	 {  
	 return services.getStudentById(studentid);  
	 }  
	 
	    
	 @PutMapping("/edit/{id}")

	    private Student update(@RequestBody Student students)   
	    {  
		   services.saveOrUpdate(students);  
	       return students;  
	    }  

	 @DeleteMapping("/delete/{id}")  
	 private void deleteStudent(@PathVariable("id") int id)   
	 {  
		 services.delete(id);  
	 }  
	
	  
	 
}