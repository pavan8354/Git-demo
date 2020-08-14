package Dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custompath {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
////		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();

		




	}

}
