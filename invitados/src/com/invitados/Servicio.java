package com.invitados;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class Servicio {
	public void alta(Invitado invitado) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(invitado);
					
		transaction.commit();
		session.close();
	}
	public void baja(Invitado invitado) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query hqlQuery = session.createQuery("DELETE FROM Invitado WHERE nombre =(:nombre)");
		
		hqlQuery.setParameter("nombre", invitado.getNombre());
		hqlQuery.executeUpdate();
		
		transaction.commit();
		session.close();
	}
	public List<Invitado> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Invitado");
		List<Invitado> invitados = hqlQuery.list();				
		session.close();			
		
		return invitados;
	}
}
