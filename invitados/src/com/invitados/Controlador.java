package com.invitados;

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
		Servicio servicio = new Servicio();		
		Invitado invitado = new Invitado();
		String pagina = "";
		String action = request.getParameter("action");
		switch (action) {
		case "alta":
			String nombre = request.getParameter("nombre");
			invitado.setNombre(nombre);
			
			servicio.alta(invitado);		
			pagina = "index.jsp";
			break;
		case "baja":
			String nombre1 = request.getParameter("nombre");
			invitado.setNombre(nombre1);
			
			servicio.baja(invitado);
			pagina = "index.jsp";
			break;	
		case "consulta":
			List<Invitado> invitados = servicio.consulta();
			request.setAttribute("invitados", invitados);
			pagina = "consulta.jsp";
			break;		
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
