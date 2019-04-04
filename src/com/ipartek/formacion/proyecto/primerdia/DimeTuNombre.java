package com.ipartek.formacion.proyecto.primerdia;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {

		// declarar una variable
		String nombre = "anonimo";

		// crear un objeto para leer por consola
		Scanner sc = new Scanner(System.in);

		// preguntamos nombre
		System.out.println("Dime tu nombre");

		// leemos el String escrito por pantalla cuando pulsa tecla 'Enter'
		// lo asignamos a la variable 'nombre'
		nombre = sc.nextLine();

		// mostrar por consola mensaje de ongi etorri
		System.out.println("Ongi Etorri " + nombre);

		System.out.println("¿  Quieres un Jardin de rosas ? (si/no) ");
		String jardin = sc.nextLine();

		// jardin == "si" == es para numeros y no para String
		if ("si".equalsIgnoreCase(jardin)) {

			System.out.println("Me pongo con ello, gracias");

		} else {

			System.out.println("Pues tu te lo pierdes");
		}

		sc.close();

	}

}
