package testnglistner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(customlistener.class)
public class Base {
	
	public static WebDriver driver;
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavansdmitmech@gmail.com");
			
	}
	
	public void failed(String testmethodname)  {
		
		TakesScreenshot srcFile = (TakesScreenshot)driver;
		File source = srcFile.getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\Dell\\eclipse-workspace\\Dynamicxpath_1"
					+ "\\Screenshots\\"+testmethodname+"_"+".jpg" ));
			System.out.println("Screen shot captured");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The obtained screen shot is.----->"+e.getMessage());
		}
	}
	
	

}
