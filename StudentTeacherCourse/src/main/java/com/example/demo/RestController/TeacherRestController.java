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

import com.example.demo.Service1.TeacherService1;
import com.example.demo.entity.Teacher;

@RestController
public class TeacherRestController {
	@Autowired
	private TeacherService1 teacherService1;
	
	@PostMapping("/saveTeacher")
	public void addTeacher(@RequestBody Teacher teacher) {
		// TODO Auto-generated method stub
		teacherService1.saveTeacher(teacher);
	}

	@GetMapping("/getTeacher")
	public List<Teacher> listAllTeacher() {
		// TODO Auto-generated method stub
		return teacherService1.listTeacher();
	}

	@DeleteMapping("/deleteTeacher{id}")
	public void deleteTeacherbyId(@PathVariable int id) {
		// TODO Auto-generated method stub
		teacherService1.deleteTeacher(id);
	}

	@PutMapping("/putTeacher")
	public void updateTeachers(@RequestBody Teacher teacher) {
		// TODO Auto-generated method stub
		teacherService1.saveTeacher(teacher);
	}
}
