package com.ipartek.formacion.proyecto.excepciones;

import java.util.Scanner;

public class ControlEntradaDatos {

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

		try {
			dias[0] = "Lunes";
			dias[1] = "Martes";
			dias[2] = "Miercoles";
			dias[3] = "Jueves";
			dias[4] = "Viernes";
			dias[5] = "Sabado";
			dias[6] = "Domingo";

			pedirDatos();

			System.out.println("Ha seleccinado el dia numero " + diaSeleccionado + " que es " + dias[diaSeleccionado]);

		} catch (Exception e) {

			System.out.println("tenemos NO controlada Exception " + e.getMessage());
			e.printStackTrace();

		} finally { // opcional
			System.out.println("finally se ejecuta siempre");
			sc.close();
		}

	}

	private static void pedirDatos() {

		boolean isException = false;

		do {
			if (isException) {
				System.out.println("***Por favor un numero del 1-7");
			} else {
				System.out.println("Dime un numero del 1 al 7");
			}
			try {
				sc = new Scanner(System.in);
				diaSeleccionado = sc.nextInt();
				isException = false;

			} catch (Exception e) {
				isException = true;
			}

		} while (isException);

	}

}
