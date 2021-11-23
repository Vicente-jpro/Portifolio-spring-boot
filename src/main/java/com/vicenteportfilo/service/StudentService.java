package com.vicenteportfilo.service;

import java.util.List;

import com.vicenteportfilo.domains.Student;
import com.vicenteportfilo.exceptions.StudentDeleteException;
import com.vicenteportfilo.exceptions.StudentNotFoundException;


public interface StudentService {
	
	void save(Student student);
	List<Student> read();
	void delete(Student student) throws StudentNotFoundException, StudentDeleteException;
	void update(Student student) throws StudentNotFoundException;
	Student getStudent(Student student) throws StudentNotFoundException;

}
