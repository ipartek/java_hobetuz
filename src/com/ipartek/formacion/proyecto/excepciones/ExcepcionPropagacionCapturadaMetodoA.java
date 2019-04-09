package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionPropagacionCapturadaMetodoA {

	public static void main(String[] args) {
		System.out.println("main - empieza");
		metodoA();
		System.out.println("main - termina");
	}

	static void metodoA() {
		System.out.println("metodoA - empieza");
		try {

			metodoB();

		} catch (Exception e) {

			System.out.println("   *** Capturada Excepccion");
			System.out.println("   *** exception message:" + e.getMessage() + " cause: " + e.getCause());
			// e.printStackTrace();

		}

		System.out.println("metodoA - termina");
	}

	static void metodoB() {
		System.out.println("metodoB - empieza");
		metodoC();
		System.out.println("metodoB - termina");
	}

	static void metodoC() {
		System.out.println("metodoC - empieza");
		String cadena = null;
		cadena.length();
		System.out.println("metodoC - termina");
	}

}
