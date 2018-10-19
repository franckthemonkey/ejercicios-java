package com.seguros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = s.parse("17-05-1992");
		Date fecha1 = s.parse("11-07-1984");
		 
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		Vehiculo vehiculo = new Vehiculo();
		Vehiculo vehiculo1 = new Vehiculo();
		Vehiculo vehiculo2 = new Vehiculo();
		Vehiculo vehiculo3 = new Vehiculo();
		List<Siniestro> siniestros = new ArrayList<Siniestro>();
		siniestros.add(new Siniestro(vehiculo, fecha, 30));
		siniestros.add(new Siniestro(vehiculo1, fecha1, 30));
		
		vehiculo.setAsientos(4);
		vehiculo.setMarca("Audi");
		vehiculo.setMatricula("4864652");
		vehiculo.setRuedas(4);
		vehiculo.setSiniestros(siniestros);
		session.save(vehiculo);
		
		vehiculo1.setAsientos(5);
		vehiculo1.setMarca("Renault");
		vehiculo1.setMatricula("12345");
		vehiculo1.setRuedas(3);
		vehiculo.setSiniestros(siniestros);
		session.save(vehiculo1);		
		
		vehiculo2.setAsientos(5);
		vehiculo2.setMarca("Chevrolet");
		vehiculo2.setMatricula("54321");
		vehiculo2.setRuedas(2);
		
		session.save(vehiculo2);
		
		vehiculo3.setAsientos(4);
		vehiculo3.setMarca("Toyota");
		vehiculo3.setMatricula("4864652");
		vehiculo3.setRuedas(1);
		
		session.save(vehiculo3);
		
		
		transaction.commit();
		session.close();
		
		
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
