package com.examen;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TiendaBO tiendaBO = new TiendaBO();
		Pelota pelota = new Pelota();
		String pagina = "";
		String action = request.getParameter("action");
		switch (action) {
		case "alta":
			String nombre = request.getParameter("nombre");
			pelota.setNombre(nombre);
			String descripcion = request.getParameter("descripcion");
			pelota.setDescripcion(descripcion);	
			int stock = Integer.parseInt(request.getParameter("stock"));
			pelota.setStock(stock);

			tiendaBO.nuevaPelota(pelota);
			pagina = "index.jsp";

			break;

		case "consulta":
			List<Pelota> pelotas = tiendaBO.consulta();
			request.setAttribute("pelotas", pelotas);
			pagina = "consulta.jsp";
			break;

		case "getPelota":
			int id = Integer.parseInt(request.getParameter("id"));
			pelota.setId(id);

			pelota = tiendaBO.getPelota(id);
			request.setAttribute("pelota", pelota);
			pagina = "modificar.jsp";
			break;

		case "modificar":
			int ide = Integer.parseInt(request.getParameter("identificador"));
			pelota.setId(ide);
			String n = request.getParameter("nombre");
			pelota.setNombre(n);
			String d = request.getParameter("descripcion");
			pelota.setDescripcion(d);			
			int s = Integer.parseInt(request.getParameter("stock"));
			pelota.setStock(s);

			tiendaBO.modificarPelota(pelota);
			request.setAttribute("pelota", pelota);

			pagina = "modificar.jsp";
			break;
		case "eliminar":
			int iden = Integer.parseInt(request.getParameter("pelotaborrar"));
			pelota.setId(iden);
			
			tiendaBO.baja(pelota);
			List<Pelota> pelotas2 = tiendaBO.consulta();
			request.setAttribute("pelotas", pelotas2);
			pagina = "consulta.jsp";
			break;	
		}

		request.getRequestDispatcher(pagina).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
