package com.ipartek.formacion.proyecto.bucles;

public class Ejercicio1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println("iteracion " + i + " es par");
			} else {
				System.out.println("iteracion " + i + " es impar");
			}

		} // end for

		System.out.println("---------------------------------------------------");

		for (int i = 10; i > 0; i--) {

			if (i % 2 == 0) {
				System.out.println("iteracion " + i + " es par");
			} else {
				System.out.println("iteracion " + i + " es impar");

			}

		} // end for

		// iteracion de 0 a N
		int parar = 0;
		while (parar < 10) {
			System.out.println("parar " + parar);
			parar++;
		}

		// iteracion de 1 a N
		int j = 232432545;
		do {
			System.out.println("Siempre se hace una vez");
			j++;
		} while (j == 10);

	}

}
