package com.example.demo.enitiy.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enitiy.Employee;
import com.example.demo.enitiy.repo.EmployeeRepo;
import com.example.demo.enitiy.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
   private EmployeeRepo employeeRepo;
	@Override
	public void addService(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public List<Employee> get() {
		 return employeeRepo.findAll();
		
	}

	@Override
	public String delete(Long id) {
		employeeRepo.deleteById(id);
		return "Delete Done";
	}

	@Override
	public String update(Long id, Employee employee) {
		 Employee emp=employeeRepo.findById(id).get();
		 emp.setAddress(employee.getAddress());
		 emp.setEmail_Id(employee.getEmail_Id());
		 emp.setName(employee.getName());
		 employeeRepo.save(emp);
		return "Update done";
	}

}
