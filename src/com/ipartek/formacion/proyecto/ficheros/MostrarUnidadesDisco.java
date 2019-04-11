package com.ipartek.formacion.proyecto.ficheros;

import java.io.File;

public class MostrarUnidadesDisco {

	public static void main(String[] args) {

		/*
		 * Para java un File puede ser:
		 * 
		 * carpeta => f.isDirectory() fichero => f.isFile()
		 * 
		 */

		File[] unidades = File.listRoots();
		System.out.printf("   %20s %20s %n", "Tamaño Total", "Tamaño disponible");

		for (File f : unidades) { // foreach

			System.out.print(f);
			System.out.printf("%20s %20s %n", f.getTotalSpace(), f.getFreeSpace());

		}

	}

}
