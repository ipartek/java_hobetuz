package com.ipartek.formacion.proyecto.excepciones;

public class ExcepccionArray {

	static String[] frutas = { "limon", "manzana", "fresa" };

	public static void main(String[] args) {

		mostrar();

		System.out.println("Nuca veras esta linea por consola");

	}

	static void mostrar() {

		System.out.println("La 1� fruta es  " + frutas[0]);
		System.out.println("La 2� fruta es  " + frutas[1]);
		System.out.println("La 3� fruta es  " + frutas[2]);
		System.out.println("La 4� fruta es  " + frutas[3]);

	}

}
