package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class ArraysFunciones {

	/*
	 * variables globales para todos los metodos de esta clase
	 ***************************************************************/

	static String dias[] = new String[7];
	static int diaSeleccionado;
	static Scanner sc = new Scanner(System.in);

	/*
	 * metodos o funciones
	 ****************************************/

	public static void main(String[] args) {

		inicializarDatos();
		pedirOpciones();
		pedirOpciones2();
		pintarResultado();

		sc.close();
	}

	private static void inicializarDatos() {
		dias[0] = "Lunes";
		dias[1] = "Martes";
		dias[2] = "Miercoles";
		dias[3] = "Jueves";
		dias[4] = "Viernes";
		dias[5] = "Sabado";
		dias[6] = "Domingo";
	}

	private static void pedirOpciones() {

		System.out.println("Dime el numero de la semana del 1 al 7");
		diaSeleccionado = sc.nextInt();
	}

	private static void pedirOpciones2() {

		System.out.println("Dime el numero de la semana del 1 al 7");
		diaSeleccionado = sc.nextInt();
	}

	private static void pintarResultado() {

		System.out.println("Ha seleccinado el dia numero " + diaSeleccionado + " que es " + dias[diaSeleccionado]);

	}

}
