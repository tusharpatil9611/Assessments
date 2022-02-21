package com.example.demo.Service1;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public void saveStudent(Student student);		//Save data into the database
	public List<Student> fetchdata();			//Retrieve data from the database
	public void deleteStudent(int id);					//Delete on the basic of id
	public void updatedataStudent(Student student);
}
