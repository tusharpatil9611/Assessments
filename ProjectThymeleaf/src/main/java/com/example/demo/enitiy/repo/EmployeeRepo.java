package com.example.demo.enitiy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.enitiy.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>
{

}
