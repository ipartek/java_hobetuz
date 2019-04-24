package com.ipartek.formacion.proyecto.model;

import java.util.ArrayList;

/**
 * Interfaz para declarar los metodos basicos de CRUD
 * 
 * @author ur00
 *
 * 
 */
public interface IPersistible<P> {

	ArrayList<P> getAll();

	P getById(int id);

	boolean create(P pojo);

	boolean delete(P pojo);

	boolean update(P pojo);

}
