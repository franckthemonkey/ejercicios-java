package com.examen;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class TiendaBO {
	public void nuevaPelota(Pelota pelota) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(pelota);
					
		transaction.commit();
		session.close();
	}
	public List<Pelota> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Pelota");
		List<Pelota> pelotas = hqlQuery.list();				
		session.close();			
		
		return pelotas;
	}
	public void modificarPelota(Pelota pelota) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(pelota);
		transaction.commit();
		session.close();
	}
	public Pelota getPelota(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Pelota> hqlQuery = session.createQuery("FROM Pelota WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		Pelota pelota = hqlQuery.getSingleResult();

		session.close();
		return pelota;
	}
	public void baja(Pelota pelota) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
	
		session.remove(pelota);
		transaction.commit();
		session.close();
	}
}
