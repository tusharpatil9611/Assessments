package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myController {
	@GetMapping("/")
	public String myPage() {
        return "NewFile";
    }

}
