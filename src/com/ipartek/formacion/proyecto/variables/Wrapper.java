package com.ipartek.formacion.proyecto.variables;

public class Wrapper {

	public static void main(String[] args) {
		
		/*
		 * Los Wrapper son clases que envuelven a las variables primitivas		 
		 * Tienen utilidades o funciones para trabajar con ellas
		 * por ejemplo convetir de String -> int y vicerversa 
		 * 
		 * */
		
		int numero = 0;
		String numeroCadena = "3";
		
		// convertirmos o parseamos de String a int
		numero = Integer.parseInt(numeroCadena);		
		System.out.println(numero);
		
		float sueldo = 600.55f;
		
		System.out.println("podemos castear de float " + sueldo + " a int " + (int)sueldo + " perdiendo la parte decimal");
		
		// byte Byte
		System.out.println("variable primitiva byte valor minimo :" + Byte.MIN_VALUE );
		System.out.println("variable primitiva byte valor maximo :" + Byte.MAX_VALUE );
		
		//int Integer
		System.out.println("variable primitiva int valor minimo :" + Integer.MIN_VALUE );
		System.out.println("variable primitiva int valor maximo :" + Integer.MAX_VALUE );
		
		// double  Double		
		// float   Float
		// boolean Boolean
		
		char variableChar = 'b';
		
		System.out.println("¿ Es digito el char 'a' ? " + Character.isDigit('a') );
		System.out.println("¿ Es digito el char '1' ? " + Character.isDigit('1') );
		System.out.println("¿ Es digito la variableChar de tipo char ? " + Character.isDigit(variableChar) );
		System.out.println("¿ Es digito el int 4 ? " + Character.isDigit(4) );
		
						
		System.out.println("el valor ascci de la variable " + variableChar + " = " + (int)variableChar );
		
		//pintar la tabla ascii
		for (int c=32; c<128; c++) {
		    System.out.println(c + ": " + (char)c);
		} 
		
				
		/*
		//pintar la tabñla ascii
		for(int i = 0; i <= 255; i++) {
			
			System.out.println("char " + (char)i + " codigo " + i );
			
		}
		*/
		
		
	}

}
