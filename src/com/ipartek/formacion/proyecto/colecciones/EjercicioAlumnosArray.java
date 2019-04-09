package com.ipartek.formacion.proyecto.colecciones;

public class EjercicioAlumnosArray {

	static String[] alumnos = { "ander", "ione", "...." };

	public static void main(String[] args) {

		printarMenu();

		// leer opcion

		// swhitch case

	}

	private static void printarMenu() {
		// TODO Auto-generated method stub

	}

	private static void listar() {

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

		return false;
	}

	/**
	 * busca alumnos por su posicion en el array
	 * 
	 * @param posicion int
	 * @return true si encuentra, false en caso contrario
	 * @throws Exception cuando accedemos fuera del array
	 */
	private static boolean buscarPorPosicion(int posicion) throws Exception {

		// capturar ArrayIndexOutBoundException y lanzar tu Exception

		return false;
	}

}
