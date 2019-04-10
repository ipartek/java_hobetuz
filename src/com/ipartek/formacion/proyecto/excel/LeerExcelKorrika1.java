package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerExcelKorrika1 {

	public static void main(String[] args) throws Exception {

		String path = "C:\\hobetuz\\projecto\\resources\\korrika1.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook libro = new XSSFWorkbook(fis);
		XSSFSheet segundaHoja = libro.getSheetAt(1);

		Iterator it = segundaHoja.iterator();
		int cont = 0;
		while (it.hasNext()) {

			XSSFRow fila = (XSSFRow) it.next();

			if (cont >= 3) {

				XSSFCell celNombre = fila.getCell(0);
				XSSFCell celTiempo = fila.getCell(1);

				System.out.println(celNombre.getStringCellValue());
				System.out.println(celTiempo.getNumericCellValue());
			}
			cont++;

		}

		// System.out.println(segundaHoja);

	}

}
