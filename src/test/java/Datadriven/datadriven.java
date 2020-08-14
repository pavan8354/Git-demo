package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\Testing_sele.xlsx");
		XSSFWorkbook xssf = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = xssf.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is......."+data0);
		
		xssf.close();
		
}
}