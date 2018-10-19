package com.listado;

import java.io.IOException;
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
		LibroBO libroBO = new LibroBO ();
		Libro libro = new Libro();
		String pagina = "asunto.jsp";
		String action = request.getParameter("action");
		switch (action) {
		case "alta":
			String titulo = request.getParameter("nuevoTitulo");
			libro.setTitulo(titulo);
			float precio = Integer.parseInt(request.getParameter("nuevoPrecio"));
			libro.setPrecio(precio);	
			
			libroBO.nuevoLibro(libro);	
			List<Libro> libros = libroBO.consulta();
			request.setAttribute("libros", libros);
			
			break;
		case "consulta":
			List<Libro> libros1 = libroBO.consulta();
			request.setAttribute("libros", libros1);
			
			break;	
		case "eliminar":
			int id = Integer.parseInt(request.getParameter("libroaborrar"));	
			libro.setId(id);
			
			libroBO.eliminarLibro(libro);
			
			List<Libro> libros2 = libroBO.consulta();
			request.setAttribute("libros", libros2);			
			
			break;	
		case "modificar":
			int ide = Integer.parseInt(request.getParameter("id"));
			libro.setId(ide);
			String t = request.getParameter("titulo");
			libro.setTitulo(t);
			float p = Integer.parseInt(request.getParameter("precio"));
			libro.setPrecio(p);
			
			libroBO.modificarLibro(libro);
			List<Libro> libros3 = libroBO.consulta();
			request.setAttribute("libros", libros3);
		}
		
			
		request.getRequestDispatcher(pagina).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
