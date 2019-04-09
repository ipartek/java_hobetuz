package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionPropagacion {

	public static void main(String[] args) {
		System.out.println("main - empieza");
		metodoA();
		System.out.println("main - empieza");
	}

	static void metodoA() {
		System.out.println("metodoA - empieza");
		metodoB();
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
