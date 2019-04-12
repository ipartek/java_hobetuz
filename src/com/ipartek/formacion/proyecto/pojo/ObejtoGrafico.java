package com.ipartek.formacion.proyecto.pojo;

/**
 * Una clase abstract puede tener 
 *      metodos implementados   => mover()
 *      metodos sin implementar => pintar()
 *      
 * Nunca podemos crear instancias de esta Clase     
 * 
 * @author ur00
 *
 */
public abstract class ObejtoGrafico {
	
	public void mover() {
		System.out.println("Me he movido");
	}
	
	public abstract void pintar();
	
	

}
