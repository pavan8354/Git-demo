package Dynamicxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchformat {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");

		List<WebElement> lists = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("The total number of elements present is ----->" +lists.size());
		
		for(int i=0;i<lists.size();i++) {
			
			System.out.println(lists.get(i).getText());
			
			if(lists.get(i).getText().contains("testing jobs")) {
				
				lists.get(i).click();
				
				break;
			}
		}
		
		





	}

}
