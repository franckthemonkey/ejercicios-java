package com.strutscalculadora;

import com.opensymphony.xwork2.ActionSupport;

public class CalculadoraAction extends ActionSupport{
	private int n1;
	private int n2;
	private String operacion;
	private int resultado;
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String execute(){
		
		if(operacion.equals("suma")) {
			resultado = n1+n2;
			
		}else if(operacion.equals("resta")) {
			resultado = n1-n2;
			
		}else if(operacion.equals("multiplicacion")) {
			resultado = n1*n2;
			
		}else if(operacion.equals("division")) {
			resultado = n1/n2;		
	}
		return SUCCESS;	
	}
	
}
