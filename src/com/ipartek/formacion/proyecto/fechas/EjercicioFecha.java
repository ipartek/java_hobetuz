package com.ipartek.formacion.proyecto.fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjercicioFecha {

	public static void main(String[] args) {

		DayOfWeek lunes = DayOfWeek.MONDAY;
		System.out.printf("8 días será: %s%n", lunes.plus(8));
		System.out.printf("2 días antes fue: %s%n", lunes.minus(2));

		// basado en copdigo ISO
		System.out.println("Castellano:");
		Locale l = new Locale("es", "ES");
		System.out.println("TextStyle.FULL:" + lunes.getDisplayName(TextStyle.FULL, l)); // lunes
		System.out.println("TextStyle.NARROW:" + lunes.getDisplayName(TextStyle.NARROW, l)); // L
		System.out.println("TextStyle.SHORT:" + lunes.getDisplayName(TextStyle.SHORT, l)); // lun

		System.out.println("Frances:");
		l = new Locale("fr", "FR");
		System.out.println("TextStyle.FULL:" + lunes.getDisplayName(TextStyle.FULL, l)); // lunes
		System.out.println("TextStyle.NARROW:" + lunes.getDisplayName(TextStyle.NARROW, l)); // L
		System.out.println("TextStyle.SHORT:" + lunes.getDisplayName(TextStyle.SHORT, l)); // lun

		LocalDate date = LocalDate.of(1999, Month.AUGUST, 23);
		DayOfWeek dia = date.getDayOfWeek();
		System.out.printf("El día que conocí a quien es mi esposa fue el %s y fue un %s%n", date, dia);

		YearMonth mes = YearMonth.now();
		System.out.printf("Este mes es %s y tiene %d días%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2004, Month.FEBRUARY);
		System.out.printf("El mes %s tuvo %d días,%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2002, Month.FEBRUARY);
		System.out.printf("el mes %s tuvo %d días,%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2000, Month.FEBRUARY);
		System.out.printf("el mes %s tuvo %d días%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(1800, Month.FEBRUARY);
		System.out.printf("Pero el mes %s tuvo %d días ¿Sabías que no es considerado bisiesto?%n", mes,
				mes.lengthOfMonth());

		MonthDay diaMes = MonthDay.of(Month.FEBRUARY, 22);
		System.out.printf("El día %s %s es válido para el año 2010%n", diaMes, diaMes.isValidYear(2010) ? "" : "no");
		// la respuesta será NO

		Year anyo = Year.now();
		System.out.printf("Este año es %s y %s es bisiesto%n", anyo, anyo.isLeap() ? "sí" : "no");

		LocalTime justoAhora = LocalTime.now();
		System.out.printf("En este momento son las %d horas con %d minutos y %d segundos\n", justoAhora.getHour(),
				justoAhora.getMinute(), justoAhora.getSecond());

		LocalDateTime ahora = LocalDateTime.now();
		System.out.printf("La hora es: %s%n", ahora);
		LocalDateTime algunDia = LocalDateTime.of(1976, Month.MARCH, 27, 6, 10);
		System.out.printf("Yo nací el %s%n", algunDia);
		System.out.printf("Hace seis meses fue %s%n", LocalDateTime.now().minusMonths(6));

	}

}
