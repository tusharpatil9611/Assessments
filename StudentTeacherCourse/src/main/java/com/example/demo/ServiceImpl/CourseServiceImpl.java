package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service1.CourseService;
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	@Override
	public List<Course> fetchdata() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}

	@Override
	public void updatCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}
	
}
