package com.Shopping.models;

public class Pago_Tarjeta {
	private final long NroTarjeta;
	private final String Filial;
	private final int FechaVencimiento;
	private final int idReferenciaTiket;
	private final int CSV;
	
	public long getNroTarjeta() {
		return NroTarjeta;
	}


	public String getFilial() {
		return Filial;
	}


	public int getFechaVencimiento() {
		return FechaVencimiento;
	}


	public int getIdReferenciaTiket() {
		return idReferenciaTiket;
	}


	public int getCSV() {
		return CSV;
	}


	public Pago_Tarjeta(String FilialTarjeta,long NumTarjeta,int vencimiento,int Verificacion,int ticket) {
		this.NroTarjeta=NumTarjeta;
		this.Filial=FilialTarjeta;
		this.FechaVencimiento=vencimiento;
		this.CSV=Verificacion;
		this.idReferenciaTiket=ticket;
	}
	
	
	public static int Verificar_Tarjeta() {
		return 0;
	}
	
	public static boolean ConfirmarSaldo() {
		return false;
	}
	
	public static boolean DescontarSaldo() {
		return false;
	}
	
}
