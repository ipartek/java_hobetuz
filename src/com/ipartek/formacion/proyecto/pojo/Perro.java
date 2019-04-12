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
public class Perro extends Animal {

	private boolean salirCalle;

	public Perro(String nombre, String raza) {
		super(nombre);
		setRaza(raza);
		setSalirCalle(false);
	}

	public Perro() {
		super();
	}

	public Perro(String nombre) {
		super(nombre);
	}

	public boolean isSalirCalle() {
		return salirCalle;
	}

	public void setSalirCalle(boolean salirCalle) {
		this.salirCalle = salirCalle;
	}

	@Override
	public String sonido() {
		return "Gua gua";
	}

	@Override
	public String toString() {
		return super.toString() + " Perro [salirCalle=" + salirCalle + "]";
	}

}
