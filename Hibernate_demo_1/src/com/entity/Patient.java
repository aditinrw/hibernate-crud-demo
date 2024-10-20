package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PatientRecord")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patient_id;
	
	@Column(name="Patient_Name")
	private String name;
	private int age;
	private String mobileNo;
	
	public Patient(){
	}

	public Patient(int patient_id, String name, int age, String mobileNo) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
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

	public void setAge(int i) {
		this.age = i;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String string) {
		this.mobileNo = string;
	}
	
	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
