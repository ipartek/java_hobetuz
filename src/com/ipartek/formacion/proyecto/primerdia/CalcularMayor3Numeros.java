package com.ipartek.formacion.proyecto.primerdia;

import java.util.Scanner;

public class CalcularMayor3Numeros {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca 1º Numero: ");
		num1 = sc.nextInt();

		System.out.print("Introduzca 2º Numero: ");
		num2 = sc.nextInt();

		System.out.print("Introduzca 3º Numero: ");
		num3 = sc.nextInt();

		System.out.println(" El campeon es " + buscarMayor(num1, num2, num3));

		sc.close();

	}

	// Esto es JAvaDoc

	/**
	 * busca el mayor numero entero de los 3
	 * 
	 * @param n1 int 1º numero
	 * @param n2 int 2º numero
	 * @param n3 int 3º numero
	 * @return el mayor de los 3 parametros de entrada
	 */
	static int buscarMayor(int n1, int n2, int n3) {

		int resultado = -1;

		if (n1 > n2) {
			if (n1 > n3) {
				resultado = n1;
			} else {
				resultado = n3;
			}
		} else if (n2 > n3) {
			resultado = n2;
		} else {
			resultado = n3;
		}

		return resultado;
	}

}
