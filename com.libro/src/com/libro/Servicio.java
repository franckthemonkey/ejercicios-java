package com.libro;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.libro.HibernateUtil;


public class Servicio {
	//devuelve un objeto del tipo Libro
	public Libro getLibro(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
				
		Query<Libro> hqlQuery = session.createQuery("SELECT l FROM Libro l WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);		
		Libro libro = hqlQuery.getSingleResult();		
		
		session.close();			
		
		return libro;
		
	}

}
