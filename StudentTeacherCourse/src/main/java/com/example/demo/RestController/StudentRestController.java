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

import com.example.demo.ServiceImpl.StudentServiceImpl;
import com.example.demo.entity.Student;

@RestController
public class StudentRestController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/saveStudent")
	public void addStudent (@RequestBody Student student) {
		// TODO Auto-generated method stub
		studentServiceImpl.saveStudent(student);
	}

	@GetMapping("/getStedent")
	public List<Student> fetchStudent() {
		// TODO Auto-generated method stub
		return studentServiceImpl.fetchdata();
	}

	@DeleteMapping("/deleteStudent{id}")
	public void deleteStudentById(@PathVariable int id) {
		// TODO Auto-generated method stub
		studentServiceImpl.deleteStudent(id);
	}

	@PutMapping("/putStudent")
	public void updateStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		studentServiceImpl.saveStudent(student);
	}
}
