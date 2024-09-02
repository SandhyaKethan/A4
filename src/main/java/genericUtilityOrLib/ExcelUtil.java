package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	/**
	 * this is the generic method to read the data in excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception 
	 */
	
public String readDataFromExcel(String sheetName, int rowNum,int cellNum) throws Exception {
	FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	DataFormatter format=new DataFormatter();
	String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
	return value;
}
/**
 * this is the generic method to write the data in excel
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @param value
 * @throws Exception 
 */
public void writeDataInExcel(String sheetName,int rowNum,int cellNum,String value) throws Exception {
	FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
	book.write(fos);
}
}
