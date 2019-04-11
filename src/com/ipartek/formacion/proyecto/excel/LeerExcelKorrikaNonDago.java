package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerExcelKorrikaNonDago {

	public static void main(String[] args) throws Exception {

		String path = "C:\\hobetuz\\projecto\\resources\\korrika1.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook libro = new XSSFWorkbook(fis);
		XSSFSheet hoja = libro.getSheetAt(2);

		LocalDateTime now = LocalDateTime.now();
		int actualHora = now.getHour();
		int actualMinutos = now.getMinute();

		long actualMilisecond = now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

		System.out.println(hoja.getSheetName());
		System.out.println("-------------------------------------------");
		System.out.printf("  %s:%s  %s \n  ", actualHora, actualMinutos, actualMilisecond);
		System.out.println("-------------------------------------------");

		Iterator it = hoja.iterator();
		int cont = 0;
		while (it.hasNext()) {

			XSSFRow fila = (XSSFRow) it.next();

			if (cont >= 3) {

				XSSFCell celNombre = fila.getCell(0);
				XSSFCell celTiempo = fila.getCell(1);

				String lugar = celNombre.getStringCellValue();
				Date dateTiempo = celTiempo.getDateCellValue();

				int horas = dateTiempo.getHours();
				int minutos = dateTiempo.getMinutes();

				LocalDateTime ldtIteracion = LocalDateTime.of(2019, 4, 11, horas, minutos);
				long iteracionMilisecond = ldtIteracion.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

				String horasMostrar = (horas < 10) ? "0" + horas : String.valueOf(horas);
				String minutosMostrar = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);
				System.out.printf("%-20s %s:%s %s %s\n", lugar, horasMostrar, minutosMostrar, iteracionMilisecond,
						actualMilisecond);

			}
			cont++;

		}

		// System.out.println(segundaHoja);

	}

}
