package com;

public class Libro extends Enciclopedia{

	//String nombre, editorial, contenido;
	private int paginas, anio, tomo;

	public Libro(){
		super();
	}

	public Libro(String nombre, String editorial, String contenido, int anio, int tomo, int paginas){
		super(nombre, editorial, contenido);
		this.anio = anio;
		this.tomo = tomo;
		this.paginas = paginas;
	}

	public int getAnio(){
		return this.anio;
	}

	public void setAnio(int anio){
		this.anio = anio;
	}

	public int getTomo(){
		return this.tomo;
	}

	public void setTomo(int tomo){
		this.tomo = tomo;
	}

	public void setPaginas(int paginas){
		this.paginas = paginas;
	}

	public int getPaginas(){
		return this.paginas;
	}

	public void getAll(){
	}

}
