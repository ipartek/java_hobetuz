package com.ipartek.formacion.proyecto.ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFicheroAutocerrable {

	public static void main(String[] args) {

		/* Si metemos dentro de los parentesis un try los recursos,
		 * se cierran automaticamente al terminar ese bloque try
		 * No tenemos porque hacer el .close();
		 *  
		 *  */
		
		try ( 
			  Scanner sc = new Scanner(System.in);
			  PrintWriter ficheroTexto = new PrintWriter("C:/hobetuz/projecto/resources/datos.txt")
		) {

			String cadena;
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
			cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			while (!cadena.equalsIgnoreCase("FIN")) {
				ficheroTexto.println(cadena); // se escribe la cadena en el fichero
				cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			}
			ficheroTexto.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}