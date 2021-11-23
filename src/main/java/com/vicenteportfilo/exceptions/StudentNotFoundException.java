package com.vicenteportfilo.exceptions;

public class StudentNotFoundException extends Exception{

	public StudentNotFoundException (String message) {
		super(message);
	}
	public StudentNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
