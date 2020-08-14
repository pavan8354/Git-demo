package Dynamicxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");

		driver.findElement(By.xpath("//input[@type='submit'and @value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();		
//		driver.findElement(By.xpath("//a[text()='Arun Deva']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
//		driver.findElement(By.xpath("//a[text()='Bala Arul']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();

		
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
		
//		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		String after_xpath = "]/td[2]/a";
//		
//		// method 1
//		for(int i=4;i<=7;i++) {	
//			 String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//			 System.out.println(name);
//			//*[@id="vContactsForm"]/table/tbody/tr[5]/td[1]/input		 
//			 if(name.contains("alter")) {			 
//				 driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();			 
//			 }
//		}
		
		// method 2
		
		driver.findElement(By.xpath("//a[text()='Arun Deva']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[text()='Charl Smith']/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
		
		






	}

}
