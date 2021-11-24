package com.vicenteportfilo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicenteportfilo.domains.Student;
import com.vicenteportfilo.enums.StudentMessageExeptionEnum;
import com.vicenteportfilo.exceptions.StudentDeleteException;
import com.vicenteportfilo.exceptions.StudentNotFoundException;
import com.vicenteportfilo.repository.StudentRepository;

@Service
public class StudendServicedb implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void save(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public List<Student> read() {
		return this.studentRepository.findAll();
	}

	@Override
	public void delete(Student student) throws StudentNotFoundException, StudentDeleteException {
		this.studentRepository.delete(student);
		
	}

	@Override
	public void update(Student student) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(Student student) throws StudentNotFoundException {
		
		return this.studentRepository.findById(student.getId())
									 .orElseThrow( ()-> new StudentNotFoundException( StudentMessageExeptionEnum.ESTUDENT_NOT_FOUND_GET.message) );
	}
	
	
	
}
