package com.Shopping.models;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Forma_pago {


	private final int id;
	private final int idCliente;
	private final String Nombre;
	private final String email;
	private final int idReferenciaTiket;
	
	@Entity
	public Forma_pago(int Cliente,String Nombre,String email,int ticket) {
		@id
		@GenerateValue(strategy=GenerationType.AUTO)
		this.id=1;
		this.idCliente=Cliente;
		this.Nombre=Nombre;
		this.email=email;
		this.idReferenciaTiket=ticket;
	}
	
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
		return 0;		
	}
	
	
	public static int PSE() {
		return 0;
	}
	
	public static boolean Efectivo() {
		return false;
	}
	
}
