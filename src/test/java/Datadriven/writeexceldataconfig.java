package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexceldataconfig {
	
	public static void main(String[] args) throws IOException {
		

		File src = new File("C:\\Users\\Dell\\Downloads\\Testing_sele.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xssf = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = xssf.getSheetAt(0);
		
		sheet1.getRow(0).createCell(3).setCellValue("Pass");
		sheet1.getRow(1).createCell(3).setCellValue("Fail");
		sheet1.getRow(2).createCell(3).setCellValue("No Result");
		
		FileOutputStream fio = new FileOutputStream(src);
		xssf.write(fio);
		
		xssf.close();
		
	}

}
