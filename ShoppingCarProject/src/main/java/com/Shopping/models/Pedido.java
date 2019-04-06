package com.Shopping.models;

public class Pedido {

	private long idproducto;
	private long cedulacliente;
	private String provedor;
	private String productos;
	private long cantidad;
	private long peso;
	private String tipo;
	private String estado;
	
	public Pedido(long idproducto,long cedulaCliente, String provedor, String productos, long cantidad,long peso,String tipo,String estado) {
		
		this.idproducto = idproducto;
		this.cedulacliente = cedulaCliente;
		this.provedor = provedor;
		this.productos = productos;
		this.cantidad = cantidad;
		this.peso = peso;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getestado() {
		return estado;
	}
	
	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	public void setCedulacliente(long cedulacliente) {
		this.cedulacliente = cedulacliente;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}

	public void setTipo(String tipo) {
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
