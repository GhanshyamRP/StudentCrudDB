package com.StudentCRUD.Main.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCRUD.Main.Model.Student;
import com.StudentCRUD.Main.Repository.StudentRepository;
import com.StudentCRUD.Main.Service.StudentService;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	StudentRepository studeRepo;
	
	@Override
	public List<Student> studentlist() {
		return studeRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studeRepo.findById(id).get();
	}

	@Override
	public Student addStudent(Student s1) {
		return studeRepo.save(s1);
	}

	@Override
	public Student updateStudent(int id, Student s1) {
		Student s2= getStudentById(id);
		if(s1.getName()!=null) {
			s2.setName(s1.getName());
		}
		if(s1.getAge() != 0) {
			s2.setAge(s1.getAge());
		}
		if(s1.getGrade() != null) {
			s2.setGrade(s1.getGrade());
		}
		if(s1.getRollNo() != 0) {
			s2.setRollNo(s1.getRollNo());
		}
		
		return studeRepo.save(s2);
	}

	@Override
	public void delStudent(int id) {
		Student s1 = getStudentById(id);
		if(s1!=null) {
			studeRepo.delete(s1);
		}
	}

}
