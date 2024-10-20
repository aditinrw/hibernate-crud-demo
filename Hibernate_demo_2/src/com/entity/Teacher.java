package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Teacher_Record")
public class Teacher {
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacher_id")
	private int id;
	private int age;
	private String qualification;
	private String subject;
	
	public Teacher() {
	}
	
	public Teacher(String name, int id, int age, String qualification, String subject) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.qualification = qualification;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", age=" + age + ", qualification=" + qualification
				+ ", subject=" + subject + "]";
	}

	
	

}
