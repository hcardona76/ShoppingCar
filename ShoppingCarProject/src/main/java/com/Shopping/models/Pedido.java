package com.Shopping.models;

public class Pedido {

	private final long IDProducto;
	private final long CedulaCliente;
	private final String Provedor;
	private final String Productos;
	private final long Cantidad;
	private final long Peso;
	private String Tipo;
	
	public Pedido(long IDProducto,long CedulaCliente, String Provedor, String Productos, long Cantidad,long Peso,String Tipo) {
		
		this.IDProducto = IDProducto;
		this.CedulaCliente = CedulaCliente;
		this.Provedor = Provedor;
		this.Productos = Productos;
		this.Cantidad = Cantidad;
		this.Peso = Peso;
		this.Tipo = Tipo;
		
	}
	
	public long getIDProducto() {
		// TODO Auto-generated method stub
		return IDProducto;
	}
	
	public long getCedulaCliente() {
		return CedulaCliente;
	}
	
	public String getProvedor() {
		return Provedor;
	}
	
	public String getProductos() {
		return Productos;
	}
	
	public long getPeso() {
		return Peso;
	}
	
	public long getCantidad() {
		return Cantidad;
	}
	
	public String getTipo() {
		return Tipo;
	}
	
	
	
}
