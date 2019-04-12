package com.ipartek.formacion.proyecto.pojo;

public class Persona {

	// atributos
	private String nombre;
	private int edad;
	private boolean casado;

	// constructores
	public Persona() {
		super();
		this.nombre = "";
		this.setEdad(0);
		this.casado = true;
	}

	// getters y setters

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "*** NULO ***";
		} else {
			this.nombre = nombre;
		}
	}

	public void saludar() {
		System.out.println("Hola soy " + this.nombre);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", casado=" + casado + "]";
	}

}
