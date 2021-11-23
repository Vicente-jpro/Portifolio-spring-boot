package com.vicenteportfilo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vicenteportfilo.domains.Student;
import com.vicenteportfilo.service.StudendServicedb;
import com.vicenteportfilo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudendServicedb studentServicedb;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("saveStudent", new Student());
		return "student_save";
	}
	
	@PostMapping("/save-student")
	public String save(@ModelAttribute("saveStudent") Student student) {
		this.studentServicedb.save(student);
		return "redirect:/view-students";
	}
	
	@GetMapping("/view-students")
	public String view(Model model) {
		return "student_view";
	}
}
