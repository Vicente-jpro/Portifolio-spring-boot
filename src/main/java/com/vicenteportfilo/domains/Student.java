package com.vicenteportfilo.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.ToString;


@ToString
@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull( message = "Name field can't be null")
	@NotEmpty( message = "Name field can't be empty")
	@Size(max = 40, message = "Your name can only have 40 caracters")
	private String name;

	@NotNull( message = "Email must be like username@domain.com but expeted null")
	@NotEmpty( message = "Email field can't be empty")
	@Size(max = 40, message = "Your email can only have 40 caracters")
	private String email;
	
	public Student() {
		
	}
	
	public Student(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
