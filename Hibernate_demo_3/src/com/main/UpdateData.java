package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e1 = ss.get(Employee.class, 1);
		
		if(e1 != null) {
			e1.setAge(28);
			ss.merge(e1);
			tr.commit();
			System.out.println("updated");
			ss.close();
		}else {
			System.out.println("record not found");
		}
	}
}
