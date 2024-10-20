package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Teacher;

public class DeleteRecord {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Teacher.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	Teacher t1 = ss.get(Teacher.class, 1);
	if(t1 != null) {
		ss.remove(t1);
		tr.commit();
		System.out.println("data deleted");
		ss.close();
	}
	else {
		System.out.println("Record not found");
	}
	
	}
}

 

