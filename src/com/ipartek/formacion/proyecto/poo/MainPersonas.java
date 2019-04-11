package com.ipartek.formacion.proyecto.poo;

public class MainPersonas {

	public static void main(String[] args) {

		Persona pepe = new Persona();
		// pepe.nombre = "Pepe Gotera";
		pepe.setNombre("Pepe Gotera");
		pepe.setEdad(45);

		System.out.println(pepe.toString());

		Persona manoli = new Persona();
		// manoli.nombre = null;
		manoli.setNombre(null);
		pepe.setEdad(-5);

		System.out.println(manoli);

	}

}
