package com.ipartek.formacion.proyecto.fechas;

import java.time.LocalDateTime;

public class QueDiaEsHoy {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();

		System.out.printf("Año %s \n", now.getYear());
		System.out.printf("Mes %s \n", now.getMonthValue());
		System.out.printf("Dia %s \n", now.getDayOfMonth());
		System.out.printf("Hora %s \n", now.getHour());
		System.out.printf("Minutos %s \n", now.getMinute());

		// para asiganr un valor a una variable con IF ELSE 5 lineas
		String medioAnyo = "";
		if (now.getMonthValue() < 6) {
			medioAnyo = "No ha pasado medio año";
		} else {
			medioAnyo = "YA ha pasado medio año";
		}

		// El codigo es mas limpio con un OPERADOR TERNARIO
		String medioAnyoTernario = (now.getMonthValue() < 6) ? "No ha pasado medio año" : "YA ha pasado medio año";
		System.out.println(medioAnyoTernario);

	}

}
