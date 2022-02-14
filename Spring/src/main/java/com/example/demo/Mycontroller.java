package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	
	@GetMapping("/display")
	public String display()
	{
	System.out.println("hello hanmant");
	return "display";
	}	
	
	
}
