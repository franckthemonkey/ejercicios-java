package com.libro;


public class Libro {
	
	private int id;
	private String isbn;
	private String titulo;
	private int precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String isbn, String titulo, int precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
	}
	

}
