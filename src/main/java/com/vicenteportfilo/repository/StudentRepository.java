package com.vicenteportfilo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicenteportfilo.domains.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
