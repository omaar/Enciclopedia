package com;

public class Enciclopedia {

  private String nombre, contenido, editorial;

  public Enciclopedia(){
    this.contenido = "";
    this.nombre = "";
    this.editorial = "";
  }

  public Enciclopedia(String nombre, String editorial, String contenido){
    this.contenido = contenido;
    this.nombre = nombre;
    this.editorial = editorial;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getContenido(){
    return this.contenido;
  }

  public void setContenido(String contenido){
    this.contenido = contenido;
  }

  public String getEditorial(){
    return this.editorial;
  }

}
