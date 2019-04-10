package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class EjercicioAlumnosArray {

	static Scanner sc = new Scanner(System.in);

	static String[] alumnos = { "ander", "ione", "itziar", "mikel", "ibon", "miguel", "pedro", "diosdado", "sergio",
			"jon", "sara" };

	// posibles opciones del usuario
	static final String OP_REPETIR = "s";
	static final String OP_REPETIR_2 = "si";
	static final String OP_LISTAR = "1";
	static final String OP_BUSCAR_NOMBRE = "2";
	static final String OP_BUSCAR_POSICION = "3";

	static boolean repetir = false;

	static String opSeleccionada = ""; // opcion selecciona del usuario por
										// consola

	public static void main(String[] args) {

		do {
			printarMenu();

			switch (opSeleccionada) {
			case OP_LISTAR:
				listar();
				break;

			case OP_BUSCAR_NOMBRE:
				operacionBuscarPorNombre();
				break;

			case OP_BUSCAR_POSICION:
				operacionBuscarPorPosicion();
				break;

			default:
				System.out.println("*** Operacion no valida ***");
				break;
			}

			preguntarRepetir();

		} while (repetir);

		System.out.println("Agur, gracias por la visita");

	}

	private static void operacionBuscarPorPosicion() {
		System.out.println("Por favor indica la posicion");
		opSeleccionada = sc.nextLine();
		int pos = 0;
		try {
			pos = Integer.parseInt(opSeleccionada);
			System.out.printf("encontrado %s", buscarPorPosicion(pos));
		} catch (Exception e) {
			System.out.println(" *** La posicion debe estar entre 0 y " + (alumnos.length - 1));
		}

	}

	private static void operacionBuscarPorNombre() {

		System.out.println("Por favor dime el nombre a buscar");
		opSeleccionada = sc.nextLine();

		try {
			if (buscarPorNombre(opSeleccionada)) {
				System.out.println("Nombre encontrado");
			} else {
				System.out.printf("Lo sentimos pero '%s' no lo hemos encontrado \n", opSeleccionada);
			}
		} catch (Exception e) {
			System.out.printf(e.getMessage());
		}

	}

	private static void preguntarRepetir() {

		System.out.println("¿ Desea repetir alguna operacion ?  (S)i (N)o ");
		opSeleccionada = sc.nextLine();

		if (OP_REPETIR.equalsIgnoreCase(opSeleccionada) || OP_REPETIR_2.equalsIgnoreCase(opSeleccionada)) {
			repetir = true;
		} else {
			repetir = false;
		}

	}

	private static void printarMenu() {

		System.out.println("----------------------------");
		System.out.println("    1) Listar ");
		System.out.println("    2) Buscar por nombre ");
		System.out.println("    3) Buscar por posicion ");
		System.out.println("----------------------------");
		System.out.println("Por favor selecciona una operacion: 1 , 2 , 3");
		opSeleccionada = sc.nextLine();
	}

	private static void listar() {

		System.out.println("\n \n 1. Listado alumnos");
		System.out.println("-----------------------------------");

		for (int i = 0; i < alumnos.length; i++) {
			System.out.printf("%s - %s \n", i, alumnos[i]);
		}

	}

	/**
	 * busca nombre de alumnos dentro del array => String[] alumnos <br>
	 * caseInsensitive
	 *
	 * @param nombre String nombre a buscar
	 * @return true si encuenta, false en caso contrario
	 * @throws Exception si nombre == null || nombre == ""
	 */
	private static boolean buscarPorNombre(String nombre) throws Exception {
		boolean resul = false;
		if (nombre == null || "".equals(nombre)) {
			throw new Exception("Lo sentimos pero ese nombre NO es permitido");
		} else {

			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i].equalsIgnoreCase(nombre)) {
					resul = true;
					break; // salimos del for si encontramos
				}
			}

		}

		return resul;
	}

	/**
	 * busca alumnos por su posicion en el array
	 *
	 * @param posicion int
	 * @return String nombre encontrado, null si no encuentra
	 * @throws Exception cuando accedemos fuera del array
	 */
	private static String buscarPorPosicion(int posicion) throws Exception {
		String resul = null;
		try {
			resul = alumnos[posicion];
		} catch (Exception e) {
			throw new Exception();
		}
		return resul;
	}

}
