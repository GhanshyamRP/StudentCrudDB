package com.StudentCRUD.Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCRUD.Main.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
