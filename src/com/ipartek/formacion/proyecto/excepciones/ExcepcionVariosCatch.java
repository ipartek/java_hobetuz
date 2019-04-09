package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionVariosCatch {

	public static void main(String[] args) {

		try {

			Integer.parseInt("123456GG");

		} catch (NullPointerException e) {
			System.out.println("**Capturada NullPointerException " + e.getMessage());

		} catch (Exception e) {
			System.out.println("**Capturada Excepcion " + e.getMessage());

		} finally {
			System.out.println("Esto se ejecuta siempre");
		}

	}

}
