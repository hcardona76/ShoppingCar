package com.Shopping.models;

public class Producto {
	
	private final int id;
	private final char nombre;
	private final String descripcion;
	private final int precio;
	private final int cantidad;
	
	public Producto(int id,char nombre, String descripcion, int precio, int cantidad) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	public int getId() {
		return id;
	}
	public char getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	

}
