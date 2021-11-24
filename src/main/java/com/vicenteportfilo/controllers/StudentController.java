package com.vicenteportfilo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String save(@Valid @ModelAttribute("saveStudent") Student student) {
		this.studentServicedb.save(student);
		return "redirect:/view-students";
	}

	@GetMapping("/update-student/{id}")
	public String formToUpdate(
			@PathVariable Long id, 
			Model model,
			@ModelAttribute("updateStudent") Student student) throws StudentNotFoundException, StudentDeleteException {
	
		model.addAttribute("updateStudent", this.studentServicedb.getStudent( new Student( id) ) );

		return "student_update";
	}
	
	@PostMapping("/update-student")
	public String update(
			@Valid @ModelAttribute("updateStudent") Student student,
			BindingResult resBindingResult
			) throws StudentNotFoundException, StudentDeleteException {
		
		resBindingResult.hasErrors() this.studentServicedb.save( student );

		return "redirect:/new-student";
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
