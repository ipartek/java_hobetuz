package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionArimetica {

	public static void main(String[] args) {

		System.out.println(" = " + dividir(4, 2.5f));
		System.out.println(" = " + dividir(1, 2.5f));
		System.out.println(" = " + dividir(400.5f, 2.5f));

		try {

			float resultado = dividir(400.5f, 0);

			if (resultado == Float.POSITIVE_INFINITY) {
				System.out.println(" ***Resulatdo infinito");
			} else {
				System.out.println("Resultado NO infinito, hacer nuestra logica de negocio");
			}

			System.out.println(" = " + resultado);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static float dividir(float valor1, float valor2) {

		System.out.print("dividimos " + valor1 + " / " + valor2);
		return valor1 / valor2;

	}

}
