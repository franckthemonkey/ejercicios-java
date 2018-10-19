package com.examen;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class PedidoAction extends ActionSupport {
	private Pedido pedido;
	private List<Pedido> pedidos;
	PedidoValores pedidoValores;

	public PedidoValores getPedidoValores() {
		return pedidoValores;
	}

	public void setPedidoValores(PedidoValores pedidoValores) {
		this.pedidoValores = pedidoValores;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String nuevo() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.nuevoPedido(pedido);
		pedidoValores = PedidoUtil.getPedidoValores(pedido);
		return SUCCESS;
	}

	public String consulta() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidos = pedidoBO.consulta();
		return SUCCESS;
	}

	public String muestraPedido() {
		PedidoBO pedidoBO = new PedidoBO();
		pedido = pedidoBO.getPedido(pedido);
		return SUCCESS;
	}

	public String modificar() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.modificarPedido(pedido);
		return SUCCESS;
	}

	public String eliminar() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.eliminarPedido(pedido);
		return SUCCESS;
	}
}
