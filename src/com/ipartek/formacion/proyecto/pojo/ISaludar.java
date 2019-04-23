package com.ipartek.formacion.proyecto.pojo;

/**
 * Una interfaz es una ***clase*** que no tiene implementacion ( codigo ).<br>
 * Puede incluso estar vacia Clonable o Serializable. <br>
 * Si tienen metodos eston seran publicos, no pueden ser privados. <br>
 * Si tienes atributos seran publicos y finales ( constantes ). <br>
 * <br>
 * 
 * Cuando una clase "implemente" una interfaz, esta obligado a implementar TODOS
 * sus metodos.
 * 
 */
public interface ISaludar {

	String saludar();

}
