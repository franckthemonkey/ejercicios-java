package com.examen;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido();
		PedidoValores pedidoValores;
		String pagina = "";
		String action = request.getParameter("action");
		switch (action) {
		case "nuevo":
			String tipo = request.getParameter("tipo");
			pedido.setTipo(tipo);
			String tam = request.getParameter("tam");
			pedido.setTam(tam);
			String cod = request.getParameter("codigo");
			pedido.setCodigo(cod);
			String dom = request.getParameter("dom");
			pedido.setDom(dom);

			pedidoBO.nuevoPedido(pedido);
			pedidoValores = PedidoUtil.getPedidoValores(pedido);
			pagina = "alta.jsp";
			break;

		case "consulta":
			List<Pedido> pedidos = pedidoBO.consulta();
			request.setAttribute("pedidos", pedidos);
			pagina = "consulta.jsp";
			break;

		case "getPedido":
			int id = Integer.parseInt(request.getParameter("id"));
			pedido.setId(id);
			pedido = pedidoBO.getPedido(id);
			request.setAttribute("pedido", pedido);
			pagina = "modifica.jsp";
			break;

		case "modificar":
			int ide = Integer.parseInt(request.getParameter("identificador"));
			pedido.setId(ide);
			String t = request.getParameter("tipo");
			pedido.setTipo(t);
			String ta = request.getParameter("tam");
			pedido.setTam(ta);
			String co = request.getParameter("codigo");
			pedido.setCodigo(co);
			String domi = request.getParameter("dom");
			pedido.setDom(domi);
			pedidoBO.modificarPedido(pedido);
			request.setAttribute("pedido", pedido);

			pagina = "index.jsp";
			break;
		case "eliminar":
			int idd = Integer.parseInt(request.getParameter("pedidoaborrar"));
			pedido.setId(idd);
			
			pedidoBO.eliminarPedido(pedido);
			List<Pedido> pedidos2 = pedidoBO.consulta();
			request.setAttribute("pedidos", pedidos2);
			pagina="index.jsp";
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
