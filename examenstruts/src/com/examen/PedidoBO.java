package com.examen;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PedidoBO {
	public void nuevoPedido(Pedido pedido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(pedido);

		transaction.commit();
		session.close();
	}

	public List<Pedido> consulta() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Pedido");
		List<Pedido> pedidos = hqlQuery.list();
		session.close();

		return pedidos;
	}

	public Pedido getPedido(Pedido pedido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Pedido pe = session.get(Pedido.class, pedido.getId());
		session.close();
		return pe;
	}

	public void modificarPedido(Pedido pedido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(pedido);
		transaction.commit();
		session.close();
	}

	public void eliminarPedido(Pedido pedido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(pedido);

		transaction.commit();
		session.close();
	}
}
