package com.ipartek.formacion.proyecto.operadores.artimeticos;

import java.util.Scanner;

public class ConversorEuros {

	public static void main(String[] args) {

		final float VALOR_DOLAR = (float) 1.12;

		System.out.println("1€ = " + VALOR_DOLAR + " $");

		float euros = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuantos euros tienes? ");

		euros = sc.nextFloat();

		System.out.println("En dolares = " + (euros * VALOR_DOLAR));

		sc.close();

	}

}
