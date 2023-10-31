package com.jspider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.entity.Student;
import com.jspider.repo.StudentRepository;

@Service
public class Studentservice {
	
	@Autowired
    private StudentRepository repo;
	
	public Iterable<Student> listAll() {
        return this.repo.findAll();
    }
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Student students)   
	{  
		repo.save(students);  
	} 
	
	public Student getStudentById(long id)   
	{  
		return repo.findById(id).get();  
	}
		 
		 
	public void update(Student students, int id)   
	{  
		repo.save(students);  
	}  	

	public void delete(long id)   
	{  
		repo.deleteById(id);  
	}  
		  
}