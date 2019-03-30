package com.Shopping.models;

public class Pedido {

	private final long idproducto;
	private final long cedulacliente;
	private final String provedor;
	private final String productos;
	private final long cantidad;
	private final long peso;
	private String tipo;
	
	public Pedido(long idproducto,long cedulaCliente, String provedor, String productos, long cantidad,long peso,String tipo) {
		
		this.idproducto = idproducto;
		this.cedulacliente = cedulaCliente;
		this.provedor = provedor;
		this.productos = productos;
		this.cantidad = cantidad;
		this.peso = peso;
		this.tipo = tipo;
	}
	
	public long getidproducto() {
		return idproducto;
	}
	
	public long getCedulaCliente() {
		return cedulacliente;
	}
	
	public String getProvedor() {
		return provedor;
	}
	
	public String getProductos() {
		return productos;
	}
	
	public long getPeso() {
		return peso;
	}
	
	public long getCantidad() {
		return cantidad;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	
	
}
