import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import com.*;

public class Main {

	public static ArrayList<Libro> libros = new ArrayList<Libro>();

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

		//nombre, editorial, contenido, anio, tomo, paginas
		Libro mamiferos = new Libro("Mamiferos", "Santillana", "Ciencias Naturales", 2002, 1, 400);
		Libro plantas = new Libro("Plantas", "Larouse", "Ciencias Naturales", 2001, 2, 350);

		libros.add(mamiferos);
		libros.add(plantas);

		for (Libro libro : libros) {
			System.out.println("\nEnciclopedia " + libro.getNombre() + " >");
			System.out.print("|-Editorial: " + libro.getEditorial() + "\n");
			System.out.print("|-Contenido: " + libro.getContenido() + "\n");
			System.out.print("|-Año: " + libro.getAnio() + "\n");
			System.out.print("|-Tomo: " + libro.getTomo() + "\n");
			System.out.print("|-Paginas: " + libro.getPaginas() + "\n");
		}

		}
}
