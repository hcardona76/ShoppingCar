package com.Shopping.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private final int id;
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
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
