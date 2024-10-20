package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Pet;

public class InsertData {
	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 cfg.addAnnotatedClass(Pet.class);
		 
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		 Transaction tr = ss.beginTransaction();
		 
		 Pet p1 = new Pet();
		 
		 p1.setBreed("poodle");
		 p1.setColor("white");
		 p1.setFavourite_food("henlo");
		
		 ss.persist(p1);
		 tr.commit();
		 System.out.println("Inserted");
		 
		 ss.close();
	}

}
