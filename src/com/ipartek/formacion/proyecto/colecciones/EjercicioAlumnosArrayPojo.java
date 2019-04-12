package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

import com.ipartek.formacion.proyecto.pojo.Alumno;

public class EjercicioAlumnosArrayPojo {

	static Scanner sc = new Scanner(System.in);

	// TODO mirarlo algun dia tema formateo
	// @see
	// https://stackoverflow.com/questions/1820908/how-to-turn-off-the-eclipse-code-formatter-for-certain-sections-of-java-code
	// @formatter:off
	static Alumno[] alumnos = { new Alumno("ander", "uraga", 2), new Alumno("ione", "Elizmnedi", 8),
			new Alumno("itziar", "Grisaleñia", 9), new Alumno("mikel", "Iglesias", 4),
			new Alumno("ibon", "Juarrero", 5), new Alumno("miguel", "", 0), new Alumno("pedro", "Martinez", 9),
			new Alumno("diosdado", "rey", 4), new Alumno("sergio", "rio", 3), new Alumno("jon", "rodriguez", 5),
			new Alumno("sara", "Senin", 2) };
	// @formatter:on

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
		System.out.println("    1) Listar ordenada por nombre alfabeticamente");
		System.out.println("    2) Listar Aprobados");
		System.out.println("    3) Listar Suspendidos");
		System.out.println("    4) Buscar por nombre ");
		System.out.println("    5) Buscar por posicion ");
		System.out.println("----------------------------");
		System.out.println("Por favor selecciona una operacion: 1 , 2 , 3, 4 o 5");
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

			for (Alumno a : alumnos) {
				if (a.getNombre().equalsIgnoreCase(nombre)) {
					resul = true;
					break; // salimos del for si encontramos
				}
			} // for

		}

		return resul;
	}

	/**
	 * busca alumnos por su posicion en el array
	 *
	 * @param posicion int
	 * @return Alumno encontrado, null si no encuentra
	 * @throws Exception cuando accedemos fuera del array
	 */
	private static Alumno buscarPorPosicion(int posicion) throws Exception {
		Alumno resul = null;
		try {
			resul = alumnos[posicion];
		} catch (Exception e) {
			throw new Exception();
		}
		return resul;
	}

}
