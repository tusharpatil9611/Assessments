package com.Simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Simple.entity.Course;
import com.Simple.jparepo.courserepo;

@RestController
@RequestMapping("Course")
public class CourseController {
	@Autowired
	courserepo courserepo;
	@RequestMapping("Save")
	public boolean save(@RequestBody Course course)
	{
	    try {
			courserepo.save(course);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	@RequestMapping("getId{id}")
	Course getById(@PathVariable int id)
	{
		return courserepo.findById(id).get();
	}

}
