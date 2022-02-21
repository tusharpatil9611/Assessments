package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.CourseServiceImpl;
import com.example.demo.entity.Course;

@RestController
public class CourseRestController {
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@PostMapping("/saveCourse")
	public void addCourse(@RequestBody Course course) {
		// TODO Auto-generated method stub
		courseServiceImpl.saveCourse(course);
	}

	@GetMapping("/getCourse")
	public List<Course> fetchCourse() {
		// TODO Auto-generated method stub
		return courseServiceImpl.fetchdata();
	}
	@DeleteMapping("/deleteCourse{id}")
	public void deleteCourseData(@PathVariable int id) {
		// TODO Auto-generated method stub
		courseServiceImpl.deleteCourse(id);
	}

	@PutMapping("/putCourse")
	public void putCourse(@RequestBody Course course) {
		// TODO Auto-generated method stub
		courseServiceImpl.saveCourse(course);
	}

}
