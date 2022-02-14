package com.Simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Simple.entity.Course;
import com.Simple.entity.Student;
import com.Simple.jparepo.Studentrepo;
import com.Simple.jparepo.courserepo;

@RestController
@RequestMapping("Student")
public class StuentController {
	@Autowired
	Studentrepo studentrepo;
	@Autowired
	courserepo courserepo;
	@RequestMapping("Save")
	public boolean Save(@RequestBody Student student)
	{
		try {
			studentrepo.save(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@RequestMapping("getById{id}")
	Student getbyId(@PathVariable int id)
	{
		return studentrepo.findById(id).get();
	}
	@RequestMapping("StudentinCourese{sid}and{cid}")
	public boolean StudentinCourese(@PathVariable int sid,@PathVariable int cid) 
	{
	     try {
	    	 Student student = studentrepo.findById(sid).get();
		      Course course = courserepo.findById(cid).get();
		  //    student.getCoures().add(course);
		      studentrepo.save(student);
		      return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
