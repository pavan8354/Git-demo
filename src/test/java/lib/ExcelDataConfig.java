package lib;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook xssf;
	XSSFSheet sheet1 ;
	
	public ExcelDataConfig(String excelpath) {
		
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			xssf = new XSSFWorkbook(fis);
			 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	public String getData(int sheetnumber,int row ,int column) {	
		
		sheet1 = xssf.getSheetAt(0);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();	
		return data;
		
	}
	
	public int getrowcount(int sheetindex)
	
	{
		int row = xssf.getSheetAt(sheetindex).getLastRowNum();
		
		row = row+1;
		
		return row;
	}
}
