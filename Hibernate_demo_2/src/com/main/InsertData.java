package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;

public class InsertData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setAge(21);
		t1.setName("riya");
		t1.setQualification("M.E.");
		t1.setSubject("English");
		
		ss.persist(t1);
		tr.commit(); 
		
		System.out.println("data inserted");
		ss.close();

	}

}
