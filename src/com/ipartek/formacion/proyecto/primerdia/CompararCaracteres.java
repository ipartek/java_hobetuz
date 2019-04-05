package com.ipartek.formacion.proyecto.primerdia;

import java.util.Scanner;

public class CompararCaracteres {

	public static void main(String[] args) {

		char char1;
		char char2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca 1º carácter: ");
		char1 = sc.nextLine().charAt(0);

		System.out.print("Introduzca 2º carácter: ");
		char2 = sc.nextLine().charAt(0);

		if (char1 == char2) {
			System.out.print("Son iguales ");
		} else {
			System.out.print("Son Diferentes!!! ");
		}

		sc.close();

	}
}
