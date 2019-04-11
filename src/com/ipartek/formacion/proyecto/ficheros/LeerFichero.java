package com.ipartek.formacion.proyecto.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) throws Exception {

		try (FileReader fr = new FileReader("C:/hobetuz/projecto/resources/datos.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		}

	}

}
