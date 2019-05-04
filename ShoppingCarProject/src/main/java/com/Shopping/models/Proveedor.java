package com.Shopping.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Proveedor {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

		private int ID;
		@Override
		
		
	public String toString() {
		return "Proveedor [ID=" + ID + ", Razon_Social=" + Razon_Social + ", RUT=" + RUT + ", Telefono_Contacto="
				+ Telefono_Contacto + ", Direccion=" + Direccion + ", Horario_Disponibilidad=" + Horario_Disponibilidad
				+ ", Contacto=" + Contacto + ", Productos=" + Productos + "]";
	}



		private String Razon_Social;
		private int RUT;
		private int Telefono_Contacto;
		private String Direccion; 
		private String Horario_Disponibilidad;
		private String Contacto;
		private String Productos;
		
	protected Proveedor() {}	
		
		public Proveedor(int ID,String Razon_Social,int RUT,int Telefono_Contacto,String Direccion,String Horario_Disponibilidad,String Contacto,String Productos) {			
			this.ID=ID;
			this.Razon_Social=Razon_Social;
			this.RUT= RUT;
			this.Telefono_Contacto= Telefono_Contacto;
			this.Direccion = Direccion;
			this.Horario_Disponibilidad=Horario_Disponibilidad;
			this.Contacto=Contacto;
			this.Productos = Productos;
		}



		public int getID() {
			return ID;
		}



		public void setID(int iD) {
			ID = iD;
		}



		public String getRazon_Social() {
			return Razon_Social;
		}



		public void setRazon_Social(String razon_Social) {
			Razon_Social = razon_Social;
		}



		public int getRUT() {
			return RUT;
		}



		public void setRUT(int rUT) {
			RUT = rUT;
		}



		public int getTelefono_Contacto() {
			return Telefono_Contacto;
		}



		public void setTelefono_Contacto(int telefono_Contacto) {
			Telefono_Contacto = telefono_Contacto;
		}



		public String getDireccion() {
			return Direccion;
		}



		public void setDireccion(String direccion) {
			Direccion = direccion;
		}



		public String getHorario_Disponibilidad() {
			return Horario_Disponibilidad;
		}



		public void setHorario_Disponibilidad(String horario_Disponibilidad) {
			Horario_Disponibilidad = horario_Disponibilidad;
		}



		public String getContacto() {
			return Contacto;
		}



		public void setContacto(String contacto) {
			Contacto = contacto;
		}



		public String getProductos() {
			return Productos;
		}



		public void setProductos(String productos) {
			Productos = productos;
		}

		
		
	}

