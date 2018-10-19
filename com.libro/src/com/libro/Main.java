package com.libro;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Libro li = new Libro("123", "Yerma", 5);		
		session.save(li);
		
		Libro li1 = new Libro("456", "La casa de Bernarda Alba", 7);		
		session.save(li1);
		
		Libro li2 = new Libro("789", "Poeta en Nueva York", 9);
		session.save(li2);	

		transaction.commit();
		session.close();
	}

}
