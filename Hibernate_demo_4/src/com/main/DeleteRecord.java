package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Pet;

public class DeleteRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Pet.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Pet p1 = ss.get(Pet.class,1);
		
		if(p1 != null) {
			ss.remove(p1);
			tr.commit();
			System.out.println("deleted");
			ss.close();
		}else {
			System.out.println("record not found");
		}
	}

}
