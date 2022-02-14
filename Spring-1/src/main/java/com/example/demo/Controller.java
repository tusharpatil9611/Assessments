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
	private EmployeeRep employeeRep;
	@RequestMapping("save")
	public String Create(@RequestBody EmployeeData employeeData)
	{
	try {
		((Object) employeeRep).save(employeeData);
	
	return "StudentIsAddSuccefulIn database";
	} catch (Exception e) {
	e.printStackTrace();
	return "Not add a Student in database";
	}



	}
	@RequestMapping("Read")
	public List<EmployeeData> Readopration()
	{
	List<EmployeeData>list=employeeRep.findAll();
	return list;

	}
	




	
}
