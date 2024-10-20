package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.entity.Pet;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Pet.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		CriteriaBuilder cb = ss.getCriteriaBuilder();
		CriteriaQuery<Pet> cq = cb.createQuery(Pet.class);
		Root<Pet> root = cq.from(Pet.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Pet> list =query.getResultList();
		
		for(Pet p: list) {
			System.out.println(p);
		}
	}	

}
