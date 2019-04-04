package com.ipartek.formacion.proyecto.variables;

public class Variables {

	public static void main(String[] args) {
		
		System.out.print("----------------------------------------- \n");
		System.out.println("-  Ejemplo de variables");
		System.out.print("----------------------------------------- \n");
		
		String nombre = "Txus";
		
		int numeroPersonas = 9; 
		
		// las constantes en java en MAYUSCULAS
		final float NUMERO_PI = 3.14f;
		
		
		/* Todas las Variables primitivas empiezan por 'minuscula' */
		
		//variables de tipo enteras
		byte edadByte = 33;
		short edadShort = 33;
		int edad = 33; // integer o numero entero
		long edadLong = 33;
		
		//varibles de tipo numeros reales o con coma
		float sueldoCasteado = (float) 5000.99;
		float sueldoSinDecimal = 5000;
		float sueldoConF =  5000.99f;
		
		double sueldoBarcenas = 500000000.99;
		
		
		//booleanas
		
		boolean isAprobado = true;
		boolean aprobado = true;
		boolean profesor = false;
		
		// caracteres son con comillas simples '', String con dobles ""
		
		char letra = 'a';
		char simbolo = '?';
		char numero = '2';
		
		
		System.out.println("Nombre: " + nombre );
		System.out.println("Edad: " + edad );
	}

}
