package com.example.demo.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enitiy.Employee;
import com.example.demo.enitiy.servicesImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("emp")
public class EmployeeController {
    
	@Autowired 
	EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("save")
	public void add(@RequestBody Employee employee)
	{
		employeeServiceImpl.addService(employee);
	}
	
	@GetMapping("read")
	public List<Employee> getEmployee()
	{
	  return employeeServiceImpl.get();
	}
	
	@PutMapping("update{id}")
	public String update(@PathVariable long id,@RequestBody Employee employee)
	{
		return employeeServiceImpl.update(id, employee);
	}
	
	@DeleteMapping("delete")
	public String delete(@PathVariable long id)
	{
		return employeeServiceImpl.delete(id);
	}
}
