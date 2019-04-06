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
	
	
	
}
