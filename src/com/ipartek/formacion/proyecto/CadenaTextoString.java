package com.ipartek.formacion.proyecto;

public class CadenaTextoString {

	public static void main(String[] args) {

		String cadena = "  Super   ";

		String cadenaLimpia = cadena.trim();
		int longitud = cadenaLimpia.length();

		System.out.println("Limpiar espacios en blanco a derecha e izquierda :" + cadena.trim());

		System.out.println("longitud: " + longitud);
		System.out.println("1º letra: " + cadenaLimpia.charAt(0));
		System.out.println("Ultima letra: " + cadenaLimpia.charAt(longitud - 1));
		System.out.println("minusculas: " + cadenaLimpia.toLowerCase());
		System.out.println("mayusculas: " + cadenaLimpia.toUpperCase());
		System.out.println("sbustring: " + cadenaLimpia.substring(2, 4));

		System.out.println(" \"asa\" cuantas 'a's tiene: " + contarLetras("asa", 'a'));

	}

	static int contarLetras(String cadena, char letra) {

		return 0;
	}

}
