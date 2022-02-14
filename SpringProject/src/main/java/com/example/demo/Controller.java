package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	StudentRepo studentrepo;
	@RequestMapping("save")
	public String Create(@RequestBody Student student)
	{
	try
	{
		studentrepo.save(student);
		return "StudentIsAddSuccefulIn database";
	}
	catch (Exception e) 	
		{
			e.printStackTrace();
			return "Not add a Student in database";
		}
	}
	@RequestMapping("Read")
	public List<Student> Readopration()
	{
		List<Student>list=studentrepo.findAll();
		return list;
	}
	
	@RequestMapping("/readBy{id}")
	public Student getbyId(@PathVariable int id)
	{
		try 
	{
		return studentrepo.findById(id).get();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
	}
		@RequestMapping("Delete{id}")
		public String Delete(@PathVariable int id)
		{
		try 
		{
			studentrepo.deleteById(id);
			return "Delete succesful from database";
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return "Not Delect From Database";
		}

		}
		@RequestMapping("Update{id}")
		public void updateData(@PathVariable int id, Student s)
		{
			Student list1= studentrepo.findById(id).get();
			list1.setId(id);
		}
		

		@RequestMapping("Update{id}")
		public List<Student> updateData(@RequestBody Student s,@PathVariable int id)
		{
		Student student= studentrepo.findById(id).get();
		student.setStudentName(s.getStudentName());
		student.setMark(s.getMark());
		studentrepo.save(student);
		return studentrepo.findAll();
		}


}
