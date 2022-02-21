package com.example.demo.Service1;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {
	public void saveCourse(Course course);		//Save data into the database
	public List<Course> fetchdata();			//Retrieve data from the database
	public void deleteCourse(int id);					//Delete on the basic of id
	public void updatCourse(Course course);
}
