package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class Arrays {

	// constantes
	static final String OPCION_IDIOMA_CASTELLANO = "c";
	static final String OPCION_IDIOMA_EUSKERA = "e";
	static final int OPCION_DIAS_1 = 1;
	static final int OPCION_DIAS_3 = 3;
	static final int OPCION_DIAS_TODOS = 7;

	// datos
	static String[] diasSemana = new String[7];
	static String[] diasSemanaEuskera = { "Astelehena", "Martitzena", "Eguazkena", "Eguena", "Barikua", "Zapatua",
			"Domeka" };
	static int[] temperaturaSemanaMax = { 13, 17, 14, 14, 15, 16, 13 };
	static int[] temperaturaSemanaMin = { 8, 7, 8, 8, 6, 7, 6 };

	// opciones seleccionadas por el usuario
	static String opIdioma;
	static int opDias;

	public static void main(String[] args) {

		leerDatosDesdeWebService();

		pedirOpciones();

		pintarResultado();

	}

	private static void pedirOpciones() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Selecciona el idioma: c-astellano  e-uskera");
			opIdioma = sc.nextLine();

		} while (!OPCION_IDIOMA_CASTELLANO.equalsIgnoreCase(opIdioma)
				&& !OPCION_IDIOMA_EUSKERA.equalsIgnoreCase(opIdioma));

		boolean isError = false; // flag
		do {

			if (isError) {
				System.out.println("por favor selecciona un numero valido: 1, 3 o 7");
			} else {
				System.out.println("¿Cuantos dias  1 , 3 o 7 todos?");
			}

			sc = new Scanner(System.in);
			opDias = sc.nextInt();

			isError = true;

		} while (OPCION_DIAS_1 != opDias && OPCION_DIAS_3 != opDias && OPCION_DIAS_TODOS != opDias);

		sc.close();

	}

	private static void leerDatosDesdeWebService() {

		// rellenamos el array con valores
		diasSemana[0] = "lunes";
		diasSemana[1] = "martes";
		diasSemana[2] = "miercoles";
		diasSemana[3] = "jueves";
		diasSemana[4] = "viernes";
		diasSemana[5] = "sabado";
		diasSemana[6] = "Domingo";

		// diasSemanaEuskera={"Astelehena","Martitzena","Eguazkena","Eguena","Barikua","Zapatua","Domeka"};

		// temperaturaSemanaMax={13,17,14,14,15,16,13};

		// temperaturaSemanaMin={8,7,8,8,6,7,6};
	}

	private static void pintarResultado() {

		System.out.println("");

		if (opIdioma.equals(OPCION_IDIOMA_CASTELLANO)) {

			for (int i = 0; i < opDias; i++) {
				System.out.println(diasSemana[i] + " " + temperaturaSemanaMin[i] + " " + temperaturaSemanaMax[i]);
			}

		} else { // euskera
			for (int i = 0; i < opDias; i++) {
				System.out
						.println(diasSemanaEuskera[i] + " " + temperaturaSemanaMin[i] + " " + temperaturaSemanaMax[i]);
			}

		}

	}// pintarResultado

}
