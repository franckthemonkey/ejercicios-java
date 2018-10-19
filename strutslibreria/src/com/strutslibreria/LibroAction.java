package com.strutslibreria;

import java.util.List;


import com.opensymphony.xwork2.ActionSupport;

public class LibroAction extends ActionSupport{
private Libro libro;
public List<Libro> getLibros() {
	return libros;
}

public void setLibros(List<Libro> libros) {
	this.libros = libros;
}
private List<Libro> libros;

public Libro getLibro() {
	return libro;
}

public void setLibro(Libro libro) {
	this.libro = libro;
}

public String alta() {
	LibroBO libroBO = new LibroBO();
	
	libroBO.nuevoLibro(libro);
	return SUCCESS;
}
public String consulta() {
	LibroBO libroBO = new LibroBO();
	
	libros = libroBO.consulta();
	return SUCCESS;
}
public String modificar() {
	LibroBO libroBO = new LibroBO();
	
	libroBO.modificarLibro(libro);
	return SUCCESS;
}
public String eliminar() {
	LibroBO libroBO = new LibroBO();
	
	libroBO.eliminarLibro(libro);
	return SUCCESS;
}

}
