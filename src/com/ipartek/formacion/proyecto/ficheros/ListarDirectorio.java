package com.ipartek.formacion.proyecto.ficheros;

import java.io.File;

public class ListarDirectorio {

	public static void main(String[] args) {

		/*
		 * File file = new File("C:/hobetuz/projecto/resources"); File[] ficheros =
		 * file.listFiles();
		 * 
		 * for (File f : ficheros) { System.out.println(f.getName() + "  esCarpeta:" +
		 * f.isDirectory()); }
		 */

		mostraDirectorio(new File("C:/hobetuz/projecto/resources"));

	}

	/**
	 * Funcion recursiva para mostrar el arbol de ficheros de un directorio
	 * 
	 * @param f File direcotrio del cual vamos a mostrar eu arbol
	 */
	static void mostraDirectorio(File f) {

		if (f != null) {

			if (f.isDirectory()) {
				System.out.println("[]" + f.getName());

				File[] files = f.listFiles();
				for (File fIteracion : files) {
					mostraDirectorio(fIteracion);
				}

			} else {
				System.out.println("-" + f.getName());
			}

		}

	}// mostraDirectorio

}
