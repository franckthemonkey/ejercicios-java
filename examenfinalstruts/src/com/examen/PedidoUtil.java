package com.examen;

public class PedidoUtil {
	public static PedidoValores getPedidoValores(Pedido pedido) {
		int p1 = getCosteTipo(pedido.getTipo());
		int p2 = getCosteTam(pedido.getTam());
		int p3 = getCosteCod(pedido.getCodigo());
		int p4 = getCosteDom(pedido.getDom());
		int costeTotal = p1 + p2 + p3 + p4;
		PedidoValores pedidoValores = new PedidoValores();
		pedidoValores.setCosteTipo(p1);
		pedidoValores.setCosteTam(p2);
		pedidoValores.setCosteCod(p3);
		pedidoValores.setCosteDom(p4);
		pedidoValores.setCosteTotal(costeTotal);
		return pedidoValores;
	}

	private static int getCosteTipo(String tipo) {
		if (tipo.equals("Margarita")) {
			return 6;
		} else if (tipo.equals("Vegetal")) {
			return 7;
		} else if (tipo.equals("Carbonara")) {
			return 8;
		} else if (tipo.equals("Barbacoa")) {
			return 9;
		} else {
			return 0;
		}

	}

	private static int getCosteTam(String tam) {
		int coste = 0;
		if (tam.equals("Mediana")) {
			coste = 0;
			return coste;
		} else if (tam.equals("Pequena")) {
			coste = (int) (coste*0.8);
			return coste;
		} else if (tam.equals("Grande")) {
			coste = (int) (coste*0.8);
			return coste;
		}else {
			coste = 0;
			return coste;
		}
		
	}
	private static int getCosteCod(String codigo) {
		int coste = 0;
		if(codigo.equals("esfamiao")) {
			coste = (int) (coste*0.6);
			return coste;
		}else {
			coste = 0;
			return coste;
		}
		
	}
	private static int getCosteDom(String dom) {
		int coste = 0;
		if(dom.equals("Si")) {
			coste = coste + 4;
			return coste;
		}else {
			coste = 0;
			return coste;
		}
		
	}
}
