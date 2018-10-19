package com.strutshospital;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class PacienteAction extends ActionSupport {
	private Paciente paciente;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	private List<Paciente> pacientes;

	public String alta() {
		HospitalBO hospitalBO = new HospitalBO();
		hospitalBO.nuevoPaciente(paciente);
		return SUCCESS;
	}

	public String consulta() {
		HospitalBO hospitalBO = new HospitalBO();
		pacientes = hospitalBO.consulta();
		return SUCCESS;

	}
	public String muestraPaciente() {
		HospitalBO hospitalBO = new HospitalBO();
		paciente = hospitalBO.getPaciente(paciente);
		return SUCCESS;
	}
	public String modificar() {
		HospitalBO hospitalBO = new HospitalBO();
		hospitalBO.modificarPaciente(paciente);
		return SUCCESS;
	}
	public String eliminar() {
		HospitalBO hospitalBO = new HospitalBO();
		
		hospitalBO.eliminarPaciente(paciente);
		return SUCCESS;
	}
}
