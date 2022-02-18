package com.example.demo.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.enitiy.Employee;
import com.example.demo.enitiy.servicesImpl.EmployeeServiceImpl;

@Controller
public class EmployeeController1 {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	   @Value("${myapp.title}") // accepting value from properties file
	    private String pageTitle;
	 
	    @GetMapping(value = { "/", "/index" })
	    public String indexPage(Model model) 
	    {
	        model.addAttribute("titleOfPage", pageTitle);   // storing in the key value pair
	        model.addAttribute("index");
	        return "index";
	    }

	    @GetMapping("/list")
	    public String listAllEmployee(Model model) 
	    {
	        List<Employee> employees=employeeServiceImpl.get();
	        model.addAttribute("employees_list", employees);
	        return "listempl";
        }
	    @GetMapping("/add")
	    
	    public String addNewEmpolyee(Model model)
	    {
	    	Employee employee=new Employee();
	    	model.addAttribute("employees_add", employee);
	    	return "add_empolyee";
	    }
	    
	   @PostMapping("/save")
	   public String saveOneEmpolyeeui(Model model,@ModelAttribute("add_employee")@RequestBody Employee employee)
	   {
		    System.out.println(employee);
		    try {
				employeeServiceImpl.addService(employee);
			} catch (Exception e) 
		    {
				return "index";
			}
		return "index";
		   
	   }
	   
}