package Datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {
	
	
	public static void main(String[] args) {
		
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		
		ChromeOptions fo = new ChromeOptions();
//		fo.addArguments("window-size=1400,800");
		fo.addArguments("--headless");
//		fo.setBinary(firefoxBinary);
		
		WebDriver driver = new ChromeDriver(fo);
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			list.get(i).click();
		}
		
		
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
//
//		driver.findElement(By.xpath("//input[@type='submit'and @value='Login']")).click();
//		String title = driver.getTitle();
//		System.out.println("home page title is ------->"+title);
		
		
		
	}

}
