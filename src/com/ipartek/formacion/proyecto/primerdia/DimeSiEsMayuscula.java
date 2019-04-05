package com.ipartek.formacion.proyecto.primerdia;

import java.io.IOException;
import java.util.Scanner;

public class DimeSiEsMayuscula {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		char car;
		System.out.print("Introduzca un carácter: ");
		car = (char) System.in.read(); // lee un solo caracter

		if (Character.isUpperCase(car)) { // utilizamos el método isUpperCase de la clase Character
			System.out.println("Es una letra mayúscula");
		} else {
			System.out.println("No es una letra mayúscula");
		}

		sc.close();
	}

}
