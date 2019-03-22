package com.Shopping.models;

public class Proveedor {

	

		private final String Nit;
		private final String Razon_Social;
		private final String Telefono1;
		private final String Telefono2;
		private final String Direccion; 
		private final String Productos;
		
		public Proveedor(String Nit,String Razon_Social,String Telefono1,String Telefono2,String Direccion,String Productos) {
			
			this.Nit=Nit;
			this.Razon_Social=Razon_Social;
			this.Telefono1= Telefono1;
			this.Telefono2= Telefono2;
			this.Direccion = Direccion;
			this.Productos = Productos;
		
		}

				
		public String getNit() {
			return Nit;
		}
		
		public String getRazon_Social() {
			return Razon_Social;
		}
		
		public String getTelefono1() {
			return Telefono1;
		}
		
		public String getTelefono2() {
			return Telefono2;
		}
		
		public String getDireccion() {
			return Direccion;
		}
		
		public String getProductos() {
			return Productos;
		}

		
		
		
	}

