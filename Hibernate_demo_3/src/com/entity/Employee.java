package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Record")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_Id;
	@Column(name="Employee_Name")
	private String name;
	private int age;
	private String department;
	
	public Employee() {
	}

	public Employee(int emp_Id, String name, int age, String department) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	
}
