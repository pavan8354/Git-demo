package Dynamicxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsconcept {

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
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			
			System.out.println(linklist.get(i).getText());
		}




	}

}
