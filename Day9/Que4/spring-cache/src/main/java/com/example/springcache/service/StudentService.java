package com.example.springcache.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.springcache.domain.Student;

@Service
public class StudentService {
	
	@Autowired
	CacheManager cacheManager;

	// Conditional Caching
	@Cacheable(value = "students", key = "#id", condition = "#id < 10")
	public Student getStudentByID(int id) {
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		System.out.println("Object in cache: "+cacheManager.getCache("students").toString());

		return new Student(id, "Sajal", "V");

	}

	// Cache Evict
	@CacheEvict(value = "students", allEntries = true)
	public Student getStudentByIdCE(int id) {
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Student(id, "Sajal", "V");
	}

	// Cache Put
	@CachePut(value = "students")
	public Student updateStudentName(int id) {
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student student = getStudentByID(id);
		student.setName("Aarti");
		return student;
	}
}
