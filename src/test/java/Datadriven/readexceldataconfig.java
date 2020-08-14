package Datadriven;

import lib.ExcelDataConfig;

public class readexceldataconfig {
	
	public static void main(String[] args) {
		
		ExcelDataConfig data1 =new ExcelDataConfig("C:\\Users\\Dell\\Desktop\\Test_sele.xlsx");
		
		System.out.println("The obtained value is----->>"+data1.getData(0, 0, 0));
		
		
	}

}
