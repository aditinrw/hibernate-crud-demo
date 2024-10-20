package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Vehicle;

public class InsertData {
	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 cfg.addAnnotatedClass(Vehicle.class);
		 
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		 Transaction tr = ss.beginTransaction();
		 
		 Vehicle v1 = new Vehicle();
		 
		 v1.setBrand("Toyota");
		 v1.setColor("white");
		 v1.setModel("Camry XSE 2024");
		 v1.setPrice(2800000);
		
		 ss.persist(v1);
		 tr.commit();
		 System.out.println("Inserted");
		 
		 ss.close();
	}

}
