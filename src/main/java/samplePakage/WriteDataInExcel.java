package samplePakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtilityOrLib.IconstantUtility;



public class WriteDataInExcel {
public static void main(String [] args) throws Exception {
	FileInputStream fis= new FileInputStream(IconstantUtility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("sheet1");
	sh.createRow(3).createCell(1).setCellValue("geetha reddy");
	FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
	book.write(fos);
	}
}

