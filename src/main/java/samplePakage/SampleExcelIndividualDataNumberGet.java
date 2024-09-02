package samplePakage;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIndividualDataNumberGet {
public static void main(String[] args) throws Exception, IOException {
	
FileInputStream fis=new FileInputStream("C:\\seliniumfolder\\testSampleData2.xlsx");

	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	DataFormatter format=new DataFormatter();
	String data1=format.formatCellValue(sh.getRow(1).getCell(1));
	System.out.println(data1);
	String data2=format.formatCellValue(sh.getRow(2).getCell(1));
	System.out.println(data2);
	String data3=format.formatCellValue(sh.getRow(3).getCell(1));
	System.out.println(data3);

}
}
