package com.ipartek.formacion.proyecto.pojo;

public class EjercicioHerencia {

	public static void main(String[] args) {

		Gato g = new Gato();
		g.setNombre("Garfiled");

		System.out.println(g);
		System.out.println(g.sonido());

		Gato g2 = new Gato("Rataplan");
		System.out.println(g2);

		Gato g3 = new Gato("Mitxi", "Persa");
		System.out.println(g3);

		Perro p = new Perro("Rumble", "boxer");
		System.out.println(p);
		System.out.println(p.sonido());

		PerroPresa p2 = new PerroPresa("Buba", "Pitbul");
		System.out.println(p2);
		System.out.println(p2.sonido());

	}

}
