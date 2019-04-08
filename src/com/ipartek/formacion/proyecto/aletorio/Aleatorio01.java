package com.ipartek.formacion.proyecto.aletorio;

public class Aleatorio01 {

	public static void main(String[] args) {
		System.out.println("Diez números aleatorios:\n");
		for (int i = 1; i < 30; i++) {
			System.out.println((int) (Math.random() * 11));
		}
	}

}
