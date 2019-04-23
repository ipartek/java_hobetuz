package com.ipartek.formacion.proyecto.model;

import java.util.ArrayList;

/**
 * Interfaz para declarar los metodos basicos de CRUD
 * 
 * @author ur00
 *
 */
public interface IPersistible<Gato> {

	ArrayList<Gato> getAll();

	Gato getByNombre(String nombre);

	boolean create(Gato g);

	boolean delete(Gato g);

	boolean update(Gato g);

}
