package com.Shopping.models;

public class Proveedor {

	

		private final int ID;
		private final String Razon_Social;
		private final int RUT;
		private final int Telefono_Contacto;
		private final String Direccion; 
		private final String Horario_Disponibilidad;
		private final String Contacto;
		private final String Productos;
		
		
		
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
		
		public String getRazon_Social() {
			return Razon_Social;
		}
		
		public int getRUT() {
			return RUT;
		}
		
		public int getTelefono_Contacto() {
			return Telefono_Contacto;
		}
		
		public String getDireccion() {
			return Direccion;
		}
		
		public String getHorario_Disponibilidad() {
			return Horario_Disponibilidad;
		}
		
		public String getContacto() {
			return Contacto;
		}
		
		public String getProductos() {
			return Productos;
		}

		
		
		
	}

