package com.Shopping.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forma_pago {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int id;
	private int idCliente;
	private String Nombre;
	public void setId(int id) {
		this.id = id;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdReferenciaTiket(int idReferenciaTiket) {
		this.idReferenciaTiket = idReferenciaTiket;
	}
	private String email;
	private int idReferenciaTiket;
	

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
	
	//
	protected Forma_pago() {}
	
	public Forma_pago(int id, int idCliente, String nombre, String email, int idReferenciaTiket) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		Nombre = nombre;
		this.email = email;
		this.idReferenciaTiket = idReferenciaTiket;
	}
	@Override
	public String toString() {
		return "Forma_pago [id=" + id + ", idCliente=" + idCliente + ", Nombre=" + Nombre + ", email=" + email
				+ ", idReferenciaTiket=" + idReferenciaTiket + "]";
	}
	
	public Forma_pago(int idCliente, int idReferenciaTicket) {
		if (idCliente==0) {
			return;
		}
		if (idReferenciaTicket==0) {
			return;
		}
	}
	
	public void Seleccion(String value) {
		switch(value) {
			case "PSE":break;
			case "TDC":break;
			case "Efectivo":break;
			default:
				return;
		}
	}
		


}
