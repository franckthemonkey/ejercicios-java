package com.libro;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Servicio {
	public void nuevoLibro(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(libro);
					
		transaction.commit();
		session.close();
	}
	public void eliminarLibro(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(libro);
		
		transaction.commit();
		session.close();
		
	}
	public void modificarLibro(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(libro);
		transaction.commit();
		session.close();
	}
	
	public List <Libro> getLibro() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Libro");
		List<Libro> libros = hqlQuery.list();				
		session.close();			
		
		return libros;
	}

}
