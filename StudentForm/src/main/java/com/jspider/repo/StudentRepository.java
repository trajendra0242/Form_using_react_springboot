package com.jspider.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspider.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
	
}