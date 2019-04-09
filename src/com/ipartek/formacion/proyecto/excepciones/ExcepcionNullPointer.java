package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionNullPointer {

	public static void main(String[] args) {

		System.out.println("Hacemos que lance un Exception de NullPointer adrede");

		String cadena = null;

		if ("constante".equals(cadena)) {
			System.out.println("IF: forma correcta de un equals");
		} else {
			System.out.println("ELSE: forma correcta de un equals");
		}

		cadena.trim();

		System.out.println("Nunca veras esta linea por consola");

	}

}
