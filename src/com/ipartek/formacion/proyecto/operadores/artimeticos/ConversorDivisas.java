package com.ipartek.formacion.proyecto.operadores.artimeticos;

import java.util.Scanner;

public class ConversorDivisas {

	// variables globales para todos los metodos
	static final float VALOR_DOLAR = (float) 1.12;
	static final float VALOR_BITCOIN = (float) 4496.39;

	public static void main(String[] args) {

		final int OPCION_EUROS = 1;
		final int OPCION_BITCOIN = 2;

		int monedaSeleccionada = 0;
		float eurosAconvertir = 0;

		Scanner sc = new Scanner(System.in);

		pintarMenu();

		do {
			System.out.println(
					String.format("¿ A que convertirmos? %s) Dolar   %s)Bitcoin ", OPCION_EUROS, OPCION_BITCOIN));
			monedaSeleccionada = sc.nextInt();

		} while (monedaSeleccionada != OPCION_BITCOIN && monedaSeleccionada != OPCION_EUROS);

		System.out.println("¿ Cuantos euros tienes ?");
		eurosAconvertir = sc.nextFloat();

		switch (monedaSeleccionada) {
		case OPCION_EUROS:
			System.out.println("convetirmos a dolares");
			break;
		case OPCION_BITCOIN:
			System.out.println("convetirmos a bitcoin");
			break;

		default:
			System.out.println("Moneda no es correcta");
			break;
		}

		sc.close();

	}// end main

	private static void pintarMenu() {

		System.out.println("----------------------------------------");
		System.out.println(String.format("1)    %s € = %f $", 1, VALOR_DOLAR));
		System.out.println(String.format("2)    %s bitcoin = %.2f €", 1, VALOR_BITCOIN));
		System.out.println("----------------------------------------");

	}

}
