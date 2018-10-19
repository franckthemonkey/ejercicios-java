package com.seguros;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Siniestro {	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	Vehiculo vehiculo;
	
	private Date fecha;
	private int perdida;
	
	
	
	

	public Siniestro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Siniestro(Vehiculo vehiculo, Date fecha, int perdida) {
		super();
		this.vehiculo = vehiculo;
		this.fecha = fecha;
		this.perdida = perdida;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getPerdida() {
		return perdida;
	}
	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}
}
