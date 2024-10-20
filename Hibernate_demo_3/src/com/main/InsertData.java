package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {
	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 cfg.addAnnotatedClass(Employee.class);
		 
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		 Transaction tr = ss.beginTransaction();
		  
		 Employee e1 = new Employee();
		 
		 e1.setName("Malhar ");
		 e1.setAge(26);
		 e1.setDepartment("Software Development");
		 
		 ss.persist(e1);
		 tr.commit();
		 System.out.println("Inserted");
		 
		 ss.close();
	}

}
