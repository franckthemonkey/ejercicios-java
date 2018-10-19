package com.strutshospital;

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

	public List<Paciente> consulta() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Paciente");
		List<Paciente> pacientes = hqlQuery.list();
		session.close();

		return pacientes;
	}

	public Paciente getPaciente(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Paciente pa = session.get(Paciente.class, paciente.getId());
		session.close();
		return pa;

	}

	public void modificarPaciente(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(paciente);
		transaction.commit();
		session.close();
	}

	public void eliminarPaciente(Paciente paciente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(paciente);
		transaction.commit();
		session.close();
	}
}
