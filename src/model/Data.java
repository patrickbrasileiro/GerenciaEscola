package model;

import com.sun.javafx.runtime.SystemProperties;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;

// construtor vazio, você digita
	public Data () {
		System.out.println("Data criada");
		
	}
	

// construtor com parametros	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
// get and set	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
 @Override
public String toString() {
	
	return dia+"/"+mes+"/"+ano;
}
}
