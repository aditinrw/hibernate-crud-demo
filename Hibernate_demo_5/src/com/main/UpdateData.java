package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Vehicle;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Vehicle v1 = ss.get(Vehicle.class, 1);
		
		if(v1 != null) {
			v1.setColor("brown");
			ss.merge(v1);
			tr.commit();
			System.out.println("updated");
			ss.close();
		}else {
			System.out.println("record not found");
		}
	}
}
