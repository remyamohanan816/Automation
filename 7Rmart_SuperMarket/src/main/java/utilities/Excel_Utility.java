package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class Excel_Utility {
	static FileInputStream f; //class in java to read details from file
	static XSSFWorkbook wb; //class to read details from workbook in excel
	static XSSFSheet sh; //class to read details from sheet  - static - access for al methods
	
	public static String getStringData(int a,int b, String sheet) throws 
IOException
	{
		f=new FileInputStream(Constant.TESTDATAFILE); 
		wb= new XSSFWorkbook(f); 
		sh=wb.getSheet(sheet); //- getsheet - method(get details from sheet)
		XSSFRow r =sh.getRow(a);  //to get data from row
		XSSFCell c = r.getCell(b); // to get cell details from row
		return c.getStringCellValue(); //to access string value
	}
	public static String getIntegerData(int a, int b, String sheet) throws IOException
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int m = (int)  c.getNumericCellValue(); //type casting - 
		return String.valueOf(m);//type conversion
		
				
	}
	public static String getFloatData(int a, int b, String sheet) throws IOException
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float m = (float) c.getNumericCellValue();
		return String.valueOf(m);
		
				
	}

}
