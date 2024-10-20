package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Patient;

public class DeleteData {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Patient.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	Patient p =ss.get(Patient.class, 1);
		if(p != null) {
			ss.remove(p);
			tr.commit();
		}
		else {
			System.out.println("Pateint data not found");
		}
		ss.close();
	}

}
