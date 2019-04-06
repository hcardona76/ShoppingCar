package com.Shopping.models;

public class facturacion {
<<<<<<< HEAD

	
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
	
	
=======
	private final int id;
	private final int idCliente;
	private final String Nombre;
	private final String email;
	private final int idReferenciaTiket;
	
	public int getId() {
		return id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getEmail() {
		return email;
	}
	public int getIdReferenciaTiket() {
		return idReferenciaTiket;
	}
	
	public static int Tarjeta_Credito() {
		
		
	}
	
	
	public static int PSE() {
		
	}
	
	public static boolean Efectivo() {
		
	}
>>>>>>> ebee9a29f46f298f3d8ca84778e25e0cacdffa24
	
}
