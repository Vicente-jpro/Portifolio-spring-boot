package com.vicenteportfilo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vicenteportfilo.domains.Student;
import com.vicenteportfilo.exceptions.StudentDeleteException;
import com.vicenteportfilo.exceptions.StudentNotFoundException;
import com.vicenteportfilo.service.StudendServicedb;
import com.vicenteportfilo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudendServicedb studentServicedb;
	
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	
	@GetMapping("/new-student")
	public String formToSave(Model model) {
		model.addAttribute("saveStudent", new Student());
		return "student_save";
	}
	
	@PostMapping("/save-student")
	public String save(@ModelAttribute("saveStudent") Student student) {
		this.studentServicedb.save(student);
		return "redirect:/view-students";
	}
	
	@GetMapping("/update-student/{id}")
	public String update(@PathVariable Long id, Model model) throws StudentNotFoundException, StudentDeleteException {
		
		Student student = this.studentServicedb.getStudent( new Student( id) );
		model.addAttribute("updateStudent", student );

		return "redirect:/view-students";
	}
	
	@GetMapping("/delete-student/{id}")
	public String delete(@PathVariable Long id  ) throws StudentNotFoundException, StudentDeleteException {
		this.studentServicedb.delete( new Student( id) );
		return "redirect:/view-students";
	}
	

	@GetMapping("/view-students")
	public String view(Model model) {
		model.addAttribute("listStudent", this.studentServicedb.read());
		return "student_view";
	}
}
