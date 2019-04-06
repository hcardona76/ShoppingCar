package com.Shopping.models;

public class facturacion {

	
	private long idfacturacion;
	private long idCompra;
	private long idCliente;
	private long idProveedor;
	private String productos; 
	private long costoTotal; 
	private String fecha;
	
	public Cliente(long cedula, String nombrecompleto, String telefono, String direccion, String celular, String tipo) {
		this.cedula=cedula;
		this.nombrecompleto=nombrecompleto;
		this.telefono= telefono;
		this.direccion = direccion;
		this.celular = celular;
		this.tipo = tipo;
	}
	
	
	
}
