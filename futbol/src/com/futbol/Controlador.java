package com.futbol;

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
		FutbolBO futbolBO = new FutbolBO();
		String action = request.getParameter("action");
		String pagina = "";
		switch(action) {
		case "consulta_equipos":
			List<Equipo> equipos = futbolBO.verEquipo();
			request.setAttribute("equipos", equipos);	
			pagina="equipos.jsp";
			break;
		case "consulta_jugadores":
			String foto_equipo = request.getParameter("foto_equipo");
			String foto_escudo = request.getParameter("foto_escudo");
			
			request.setAttribute("foto_equipo", foto_equipo);
			request.setAttribute("foto_escudo", foto_escudo);
			
			int equipo_cod = Integer.parseInt(request.getParameter("equipo_cod"));
			
			List <Jugador> jugadores = futbolBO.verJugador(equipo_cod);
			request.setAttribute("jugadores", jugadores);
			pagina = "jugadores.jsp";
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
