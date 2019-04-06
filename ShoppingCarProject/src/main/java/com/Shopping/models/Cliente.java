package com.Shopping.models;

public class Cliente {

	private final long Cedula;
	private final String Nombre_Completo;
	private final String Telefono;
	private final String Direccion; 
	private final String Celular;
	
	public Cliente(long Cedula, String Nombre_Completo, String Telefono, String Direccion, String Celular) {
		// TODO Auto-generated constructor stub
		this.Cedula=Cedula;
		this.Nombre_Completo=Nombre_Completo;
		this.Telefono= Telefono;
		this.Direccion = Direccion;
		this.Celular = Celular;
	
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return Nombre_Completo;
	}
	
	public long getCedula() {
		return Cedula;
	}
	
	public String getTelefono() {
		return Telefono;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	
	public String getCelular() {
		return Celular;
	}

	
	
	
}
