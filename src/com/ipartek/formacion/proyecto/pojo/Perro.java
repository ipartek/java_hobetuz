package com.ipartek.formacion.proyecto.pojo;

/**
 * Esto es una clas de tipo POJO @see
 * https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 * 
 * Debe estar encapsulado Se compone de varias partes:
 * <ol>
 * <li>Atributos *privados</li>
 * <li>Constructores * para instanciar objetos, puede tener mas de uno</li>
 * <li>Getters y Setters *publicos para poder acceder a los atributos</li>
 * <li>ToString</li>
 * <li>Otros metodos</li>
 * </ol>
 * 
 * @author ur00
 *
 */
public class Perro {

	// Atributos

	private String nombre;
	private String raza;

	// Constructores para crear objetos

	// constrcutor por defecto
	public Perro() {
		super();
		this.nombre = "";
		this.raza = "cruce";
	}

	// construstor con parametros, estamos sobrecargando ( mismo return, mismo
	// nombre, pero diferentes parametros)

	public Perro(String nombre) {
		this();
		// super();
		this.nombre = nombre;
	}

	public Perro(String nombre, String raza) {
		// super();
		this();
		this.nombre = nombre;
		this.raza = raza;
	}

	// getters y setters para los atributos

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + "]";
	}

	// otros metodos
	public String ladrar() {
		return "gua gua";
	}

}
