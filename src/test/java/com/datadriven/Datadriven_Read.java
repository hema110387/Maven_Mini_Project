package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void read_Particular_Data() throws Throwable {

		System.out.println("**particular Data**");

		File f = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Product_details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(1);

		CellType ct = cell.getCellType();

		if (ct.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (ct.equals(CellType.NUMERIC)) {

			double numericValue = cell.getNumericCellValue();
			int num = (int) numericValue;
			System.out.println(num);
		}
	}

	public static void read_All_Data() throws Throwable {

		System.out.println("**All Data**");

		File f = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Product_details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);

				CellType ct = cell.getCellType();

				if (ct.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (ct.equals(CellType.NUMERIC)) {

					double numericValue = cell.getNumericCellValue();
					int num = (int) numericValue;
					System.out.println(num);
				}

			}
		}
	}

	public static void row_Data() throws Throwable {
		System.out.println("====RowData====");

		File f = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Product_details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		int numberOfCells = row.getPhysicalNumberOfCells();

		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);

			CellType ct = cell.getCellType();

			if (ct.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (ct.equals(CellType.NUMERIC)) {

				double numericValue = cell.getNumericCellValue();
				int num = (int) numericValue;
				System.out.println(num);
			}

		}

	}

	public static void column_Data() throws Throwable {

		System.out.println("====Column Data====");

		File f = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Product_details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			Cell cell = row.getCell(0);

			CellType ct = cell.getCellType();

			if (ct.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (ct.equals(CellType.NUMERIC)) {

				double numericValue = cell.getNumericCellValue();
				int num = (int) numericValue;
				System.out.println(num);
			}
		}

	}

	public static void main(String[] args) throws Throwable {

		read_Particular_Data();
		System.out.println();
		read_All_Data();
		System.out.println();
		row_Data();
		System.out.println();
		column_Data();
	}

}
