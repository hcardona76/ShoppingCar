package com.Shopping.models;

public class Cliente {
	private long cedula;
	private String nombrecompleto;
	private String telefono;
	private String direccion; 
	private String celular;
	private String tipo;
	
	public Cliente(long cedula, String nombrecompleto, String telefono, String direccion, String celular, String tipo) {
		this.cedula=cedula;
		this.nombrecompleto=nombrecompleto;
		this.telefono= telefono;
		this.direccion = direccion;
		this.celular = celular;
		this.tipo = tipo;
	}
	
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombrecompleto;
	}
	
	public long getCedula() {
		return cedula;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public String getTipo() {
		return tipo;
	}
	

	
	
	
}
