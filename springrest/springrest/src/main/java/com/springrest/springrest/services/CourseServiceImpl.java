package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Course(111,"Java Rest Apli", "Contains API"));
		list.add(new Course(2323,"Spring Boot", "Rest API"));
		
	}
	
	
	@Override
	public List<Course> getCourses() {

		
		return list;
	}

}
