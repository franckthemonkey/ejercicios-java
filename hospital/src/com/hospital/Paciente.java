package com.hospital;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Paciente {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String nombre;
private String apellido;
private Date fecha_alta;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Date getFecha_alta() {
	return fecha_alta;
}
public void setFecha_alta(Date fecha_alta) {
	this.fecha_alta = fecha_alta;
}

}
