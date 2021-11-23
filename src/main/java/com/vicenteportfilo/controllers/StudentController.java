package com.vicenteportfilo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/")
	public String hello(Model model) {
		String messageInfo = "Hello thymeleaf";
		model.addAttribute("message", messageInfo);
		return "student_save";
	}
}
