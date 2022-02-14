package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController			// annotation to create a bean
public class YourController {
@Autowired MyService myService;
@GetMapping("/myweb")

	public String homepage()
	{
		return "index";
	}

@GetMapping("/service")
 	public String helloService()
 	{
		return myService.sayHello();	
	}
}
