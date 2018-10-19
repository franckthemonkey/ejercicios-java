package com.hospital;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HospitalBO hospitalBO = new HospitalBO ();
		Paciente paciente = new Paciente();	
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String pagina = "";
		String action = request.getParameter("action");
		switch (action) {
		case "alta":
			String nombre = request.getParameter("nombre");
			paciente.setNombre(nombre);
			String apellido = request.getParameter("apellido");
			paciente.setApellido(apellido);			
			try {
				Date fecha_alta = formatter.parse(request.getParameter("fecha_alta"));
				paciente.setFecha_alta(fecha_alta);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			hospitalBO.nuevoPaciente(paciente);		
			pagina = "index.jsp";
			
			
			break;
			
		case "consulta":
			List<Paciente> pacientes = hospitalBO.consulta();
			request.setAttribute("pacientes", pacientes);
			pagina = "consulta.jsp";
			break;	
			
		case "getPaciente":
			int id = Integer.parseInt(request.getParameter("id"));
			paciente.setId(id);
			
			paciente = hospitalBO.getPaciente(id);
			request.setAttribute("paciente", paciente);	
			pagina="modificar.jsp";
			break;
			
		case "modificar":
			try {
			int ide = Integer.parseInt(request.getParameter("identificador"));
			paciente.setId(ide);
			String n = request.getParameter("nombre");
			paciente.setNombre(n);
			String a = request.getParameter("apellido");
			paciente.setApellido(a);			
			Date fe_alta = formatter.parse(request.getParameter("fecha_alta"));
			paciente.setFecha_alta(fe_alta);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			hospitalBO.modificarPaciente(paciente);
			request.setAttribute("paciente", paciente);
			
			pagina= "index.jsp";
			
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
