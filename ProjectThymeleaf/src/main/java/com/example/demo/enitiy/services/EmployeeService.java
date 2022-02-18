package com.example.demo.enitiy.services;

import java.util.List;

import com.example.demo.enitiy.Employee;

public interface EmployeeService {
  
	public void addService(Employee employee);
	public List<Employee>get();
	public String delete(Long id);
	public String update(Long id,Employee employee);
	
}
