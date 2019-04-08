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

		System.out.println(" \"asa\" cuantas 'a's tiene: " + contarLetras("Asa", 'a'));

		System.out.println(" \"asa\" cuantas 'a's tiene: " + contarLetras(null, 'a'));

	}

	/**
	 * Cuenta las letras de una palabra, es caseInsensitive le da igual mayusculas
	 * que minusculas
	 * 
	 * @param cadena String palabra a contar las letras
	 * @param letra  char letra a contar
	 * @return int letras contadas
	 */
	public static int contarLetras(String cadena, char letra) {

		int resul = 0;
		if (cadena != null && Character.isLetter(letra)) {
			for (int i = 0; i < cadena.length(); i++) {
				char letraActual = cadena.charAt(i);
				if (Character.toUpperCase(letraActual) == Character.toUpperCase(letra)) {
					resul++;
				}
			}
		}
		return resul;
	}

	public static String darVuelta(String cadena) {
		String resul = "";
		if (cadena != null) {
			for (int i = 0; i < cadena.length(); i++) {
				resul += cadena.charAt(cadena.length() - i - 1);
			}
		}
		return resul;
	}

	/**
	 * Indica si la paralabra es palidroma o no <br>
	 * Es caseInsensitive <br>
	 * Trima los espacios en blanco a derecha e izquierda
	 * 
	 * @param cadena String con la palabra o frase a determinar si es palindroma
	 * @return boolean caso especiales null y cadena vacia "" return false
	 */
	public static boolean isPalindromo(String cadena) {
		boolean resul = false;
		if (cadena != null && !"".equals(cadena)) {

			String cadenaDadaVuelta = darVuelta(cadena).toLowerCase().trim();
			if (cadena.toLowerCase().trim().equals(cadenaDadaVuelta)) {
				resul = true;
			}
		}
		return resul;
	}

}
