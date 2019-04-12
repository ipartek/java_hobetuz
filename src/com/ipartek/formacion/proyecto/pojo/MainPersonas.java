package com.ipartek.formacion.proyecto.pojo;

import javax.swing.JOptionPane;

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

		Perro rumble = new Perro();
		rumble.setNombre("Rumble");
		rumble.setRaza("boxer");
		System.out.println(rumble);

		Perro zuma = new Perro("Zuma");
		System.out.println(zuma);

		Perro chase = new Perro("Chasse", "perro pastor");
		System.out.println(chase);

		Gato garfield = new Gato();
		System.out.println(garfield);

		Gato mitxi = new Gato("Mitxi");
		System.out.println(mitxi);

		// pedir datos para crear un gato

		String nombre = JOptionPane.showInputDialog("Dime el Nombre del Gato");

		boolean error = true;
		float peso = 0;
		do {
			try {
				String sPeso = JOptionPane.showInputDialog("¿Cuanto pesa ? kg");
				peso = Float.parseFloat(sPeso);
				error = false;
			} catch (Exception e) {
				System.out.println("**** capturo la excepcion");
			}
		} while (error);

		int opcionVacunado = JOptionPane.showConfirmDialog(null, "¿Esta vacunado?", "", JOptionPane.YES_NO_OPTION);
		// 0=yes, 1=no

		String[] razas = { "Cruce", "Persa", "Siames" };
		String razaSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona raza", "",
				JOptionPane.QUESTION_MESSAGE, null, razas, // Array of choices
				razas[1]); // Initial choice

		// crear un gato con los valores del usuario
		Gato g = new Gato();
		g.setNombre(nombre);
		g.setRaza(razaSeleccionada);
		g.setPeso(peso);
		g.setVacunado((opcionVacunado == 0) ? true : false);

		System.out.println(g);

	}

}
