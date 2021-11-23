package com.vicenteportfilo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicenteportfilo.domains.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
