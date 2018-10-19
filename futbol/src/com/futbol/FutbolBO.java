package com.futbol;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;



public class FutbolBO {
	public List<Equipo> verEquipo(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Equipo");
		List<Equipo> equipos = hqlQuery.list();				
		session.close();			
		
		return equipos;
	}
	public List<Jugador> verJugador(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM  Jugador WHERE equipo_cod= (:condicion)");
		hqlQuery.setParameter("condicion",id);
		List <Jugador> jugadores = hqlQuery.list();
		session.close();
		
		return jugadores;
	}
}
