package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_Data() throws Throwable {

	
	File f=new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Product_details.xlsx");
	
	FileInputStream fis = new FileInputStream(f);

	Workbook w = new XSSFWorkbook(fis);
	
	Sheet createSheet = w.createSheet("Customer_Details1");
	
	Row createRow = createSheet.createRow(0);
	
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue("Customer Name");
	
	w.getSheet("Customer_Details1").getRow(0).createCell(1).setCellValue("Customer_Pno");
	w.getSheet("Customer_Details1").createRow(1).createCell(0).setCellValue("Hema");
	w.getSheet("Customer_Details1").getRow(1).createCell(1).setCellValue("9087654345");
	w.getSheet("Customer_Details1").createRow(2).createCell(0).setCellValue("Saru");
	w.getSheet("Customer_Details1").getRow(2).createCell(1).setCellValue("9085654345");
	w.getSheet("Customer_Details1").createRow(3).createCell(0).setCellValue("Ganesh");
	w.getSheet("Customer_Details1").getRow(3).createCell(1).setCellValue("9085654009");
	
	FileOutputStream fos=new FileOutputStream(f);
	
	w.write(fos);
	
	w.close();
}
	public static void main(String[] args) throws Throwable {
		
		write_Data();
		
	}
}