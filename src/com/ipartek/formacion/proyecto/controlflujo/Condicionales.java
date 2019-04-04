package com.ipartek.formacion.proyecto.controlflujo;

public class Condicionales {

	
	
	
	public static void main(String[] args) {
		
		
		final int MAYORIA_EDAD = 18;
		final int EDAD_JOVEN = 40;
		final int EDAD_JUBILACION = 65;  
		
		final int MAYORIA_EDAD_MENTAL_HOMBRES = EDAD_JUBILACION;
		final int MAYORIA_EDAD_MENTAL_MUJERES = 30;
		          
				
		int edadPepe = 18;
		
		if( edadPepe >= MAYORIA_EDAD ) {
			System.out.println("Es mayor de Edad");
		}else {
			System.out.println("Es menor de Edad");
		}
		
		if ( edadPepe >= MAYORIA_EDAD_MENTAL_HOMBRES ) {
			System.out.println("Mentalmente Es mayor de Edad");
		}else {
			System.out.println("Mentalmente Es menor de Edad");
		}
		
		
		int edadAna = 64;
		
		System.out.println("Edad de Ana " + edadAna);
		if ( edadAna < MAYORIA_EDAD ) {
			System.out.println("Eres menor de edad");
		}else if ( edadAna < EDAD_JOVEN) {
			System.out.println("Eres joven");
		}else if( edadAna < EDAD_JUBILACION) {
			System.out.println("Eres madura");
		}else {
			System.out.println("Cuidate");
		}
		
		

	}

}
