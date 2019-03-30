package com.Shopping.models;

public class Cliente {
	private final long cedula;
	private final String nombrecompleto;
	private final String telefono;
	private final String direccion; 
	private final String celular;
	private final String tipo;
	
	public Cliente(long cedula, String nombrecompleto, String telefono, String direccion, String celular, String tipo) {
		this.cedula=cedula;
		this.nombrecompleto=nombrecompleto;
		this.telefono= telefono;
		this.direccion = direccion;
		this.celular = celular;
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
