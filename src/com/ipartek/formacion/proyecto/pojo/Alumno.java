package com.ipartek.formacion.proyecto.pojo;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int nota;

	public Alumno(String nombre, String apellidos, int nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.setNota(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {

		if (nota < 0 || nota > 10) {
			this.nota = 0;
		} else {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + "]";
	}
}
