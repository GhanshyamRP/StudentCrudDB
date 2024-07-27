package com.StudentCRUD.Main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy =  GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private int rollNo;
	private String grade;
	
	
	
	public Student() {
	}

	public Student(int id, String name, int age, int rollNo, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
