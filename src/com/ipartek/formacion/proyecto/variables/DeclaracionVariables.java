package com.ipartek.formacion.proyecto.variables;

public class DeclaracionVariables {

	public static void main(String[] args) {

		// nombre
		String nombre = "Ander";
		// apellidos
		String apellido = "Uraga";
		// sueldo
		float sueldo = 3550.78f;
		// edad
		int edad = 37;
		// casado o no
		boolean isCasado = false;
		// numero de hijos
		int hijos = 5;
		// calle
		String calle = "Avenida Barrio Sesamo";
		// portal
		int portal = 40;
		// letra del piso
		char letra = 'B';

		System.out.println("Nombre: " + nombre + ", " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Sueldo: " + sueldo + "€");
		System.out.println("Numero Hijos: " + hijos);

		if ( !isCasado ) {
			System.out.println("Casado: No");
		} else {
			System.out.println("Casado: Si");
		}

		System.out.println("Dirección: " + calle + " " + portal + " " + letra);

	}

}
