package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\Testing_sele.xlsx");
		XSSFWorkbook xssf = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = xssf.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("Total Row count is---->"+rowcount+1);
		
		for(int i=0;i<rowcount;i++) {
			
			String data1 =sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Test Data from Excel is----->"+data1);
		}
		xssf.close();
}
}