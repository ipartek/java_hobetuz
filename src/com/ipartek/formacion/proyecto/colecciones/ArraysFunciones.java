package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class ArraysFunciones {

	/*
	 * variables globales para todos los metodos de esta clase
	 ***************************************************************/

	static String dias[] = new String[7];

	static int diaSeleccionado;

	/*
	 * metodos o funciones
	 ****************************************/

	public static void main(String[] args) {

		inicializarDatos();
		pedirOpciones();
		pintarResultado();

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de la semana del 1 al 7");
		diaSeleccionado = sc.nextInt();

		sc.close();
	}

	private static void pintarResultado() {

		System.out.println("Ha seleccinado el dia numero " + diaSeleccionado + " que es " + dias[diaSeleccionado]);

	}

}
