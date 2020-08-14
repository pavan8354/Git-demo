package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

 
public class TestDDT2 {
	
	WebDriver driver;
 
// this will take data from dataprovider which we created
@Test(dataProvider="testdata")
public void TestFireFox(String uname,String password){
 
// Open browsre
	System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
	driver=new ChromeDriver();
 
 
// Maximize browser
driver.manage().window().maximize();
 
 
// Load application
driver.get("http://demosite.center/wordpress/wp-login.php");
 
 
// clear email field
 
driver.findElement(By.id("user_login")).clear();
 
 
// Enter usename
driver.findElement(By.id("user_login")).sendKeys(uname);
 
 
 
// Clear password field
driver.findElement(By.id("user_pass")).clear();
 
 
 
// Enter password
driver.findElement(By.id("user_pass")).sendKeys(password);

driver.findElement(By.xpath("//*[@id='wp-submit']")).click();

//System.out.println(driver.getTitle());

Assert.assertTrue(driver.getTitle().contains("Log In "));

System.out.println("User is able to verify successfully");
}

@AfterTest

public void teardown() {
	
	driver.quit();
}
 
// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
@DataProvider(name="testdata")
public Object[][] TestDataFeed(){
	
	ExcelDataConfig config= new ExcelDataConfig("C:\\Users\\Dell\\eclipse-workspace\\Dynamicxpath_1\\TestData\\InputData.xlsx");
	
	int rows = config.getrowcount(0);
	

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
Object [][] facebookdata=new Object[rows][2];
 
 for(int i=0;i<rows;i++) {
	 
	 facebookdata[i][0] =  config.getData(0, i, 0);
	 facebookdata[i][1] =  config.getData(0, i, 1);
 }
 
// Enter data to row 0 column 0

 
// return arrayobject to testscript
return facebookdata;
}
}