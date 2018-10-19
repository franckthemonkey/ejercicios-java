package com.seguros;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		String queryString = "FROM Vehiculo";
		Query hqlQuery = session.createQuery(queryString);		
		List result2 = hqlQuery.list();
	
		Iterator<Vehiculo> it = result2.iterator();
		
		
		while(it.hasNext()) {
			Vehiculo v = it.next();
			System.out.println("Matricula " + v.getMatricula());
			
		}
		System.out.println("===========================================================");
		Query hqlQuery2 = session.createQuery("FROM Vehiculo ORDER BY ruedas");
		List result = hqlQuery2.list();
		Iterator<Vehiculo> itt = result.iterator();
		
		while(itt.hasNext()) {
			Vehiculo ve = itt.next();
			System.out.println("Matrícula: "+ ve.getMatricula() + " Marca: " + ve.getMarca() + " Ruedas: " + ve.getRuedas());
		}
		System.out.println("============================================================");
		
		Query<Vehiculo> hqlQuery3 = session.createQuery(" SELECT v FROM Vehiculo v WHERE v.ruedas>2 AND v.asientos>2");
		List<Vehiculo> vehiculos3 = hqlQuery3.list();
		Iterator<Vehiculo> ittt = vehiculos3.iterator();
		
		while(ittt.hasNext()) {
			Vehiculo v = ittt.next();
			System.out.println("Matrícula: "+ v.getMatricula() + " Marca: " + v.getMarca() + " Ruedas: " + v.getRuedas());
		}
		System.out.println("==============================================================");
		
		Query<Vehiculo> hqlQuery4 = session.createQuery(" SELECT v FROM Vehiculo v WHERE v.ruedas>2 OR v.asientos>2");
		List<Vehiculo> vehiculos4 = hqlQuery4.list();
		Iterator<Vehiculo> it4 = vehiculos4.iterator();
		
		while(it4.hasNext()) {
			Vehiculo v = it4.next();
			System.out.println("Matrícula: "+ v.getMatricula() + " Marca: " + v.getMarca() + " Ruedas: " + v.getRuedas());
		}
		System.out.println("==============================================================");
		Query<Vehiculo> hqlQuery5 = session.createQuery(" SELECT v FROM Vehiculo v WHERE length(v.matricula)<6");
		List<Vehiculo> vehiculos5 = hqlQuery5.list();
		Iterator<Vehiculo> it5 = vehiculos5.iterator();
		
		while(it5.hasNext()) {
			Vehiculo v = it5.next();
			System.out.println("Matrícula: "+ v.getMatricula() + " Marca: " + v.getMarca() + " Ruedas: " + v.getRuedas());
		}
		
		System.out.println("==============================================================");
		Query<Vehiculo> hqlQuery6 = session.createQuery("SELECT v FROM  Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
		List<Vehiculo> vehiculos6 = hqlQuery6.list();
		Iterator<Vehiculo> it6 = vehiculos6.iterator();
		
		while(it6.hasNext()) {
			Vehiculo v = it6.next();
			System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		System.out.println("===============================================================");
		Query<Vehiculo> hqlQuery7 = session.createQuery("SELECT new com.seguros.seguros.Siniestro(v,perdida) FROM  Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
		List<Vehiculo> vehiculos7 = hqlQuery7.list();
		Iterator<Vehiculo> it7 = vehiculos7.iterator();
		
		while(it7.hasNext()) {
		
		Vehiculo v = it7.next();
		System.out.println(v.getMatricula()+ " - "+ v.getMarca() + " - " + v.getRuedas());
		}
		
		transaction.commit();
		session.close();	
	}
	 

}
