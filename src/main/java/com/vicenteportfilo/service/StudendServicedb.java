package com.vicenteportfilo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicenteportfilo.domains.Student;
import com.vicenteportfilo.exceptions.StudentDeleteException;
import com.vicenteportfilo.exceptions.StudentNotFoundException;
import com.vicenteportfilo.repository.StudentRepository;

@Service
public class StudendServicedb implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Student student) throws StudentNotFoundException, StudentDeleteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student student) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(Student student) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
