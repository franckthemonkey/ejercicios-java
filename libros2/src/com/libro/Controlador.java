package com.libro;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Servicio servicio = new Servicio ();
		Libro libro = new Libro();		
		String action = request.getParameter("action");
		switch (action) {
		case "alta":
			String titulo = request.getParameter("titulo");
			String isbn = request.getParameter("isbn");
			int precio = Integer.parseInt(request.getParameter("precio"));
			libro.setIsbn(isbn);
			libro.setPrecio(precio);
			libro.setTitulo(titulo);
			
			servicio.nuevoLibro(libro);
			break;
			
		case "baja":
			int id = Integer.parseInt(request.getParameter("id"));
			libro.setId(id);
			
			servicio.eliminarLibro(libro);
			break;
			
		case "modificar":
			String t = request.getParameter("titulo");
			String i = request.getParameter("isbn");
			int p = Integer.parseInt(request.getParameter("precio"));
			int id1 = Integer.parseInt(request.getParameter("id"));
			
			libro.setTitulo(t);
			libro.setId(id1);
			libro.setIsbn(i);
			libro.setPrecio(p);
			
			servicio.modificarLibro(libro);
			break;
			
		case "consulta":
			List<Libro> libros = servicio.getLibro();
			Iterator<Libro> it = libros.iterator();
			while(it.hasNext()) {
				Libro l = it.next();
				response.getWriter().append(l.getTitulo() + " " + l.getPrecio());
			}
			break;
		}		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
