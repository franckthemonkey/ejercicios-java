package com.hospital;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class HospitalBO {
	public void nuevoPaciente(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(paciente);
					
		transaction.commit();
		session.close();
	}
	public List<Paciente> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Paciente");
		List<Paciente> pacientes = hqlQuery.list();				
		session.close();			
		
		return pacientes;
	}
	public void modificarPaciente(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(paciente);
		transaction.commit();
		session.close();
	}
	public Paciente getPaciente(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Paciente> hqlQuery = session.createQuery("FROM Paciente WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		Paciente paciente = hqlQuery.getSingleResult();

		session.close();
		return paciente;
	}
}
