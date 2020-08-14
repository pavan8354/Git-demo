package Dynamicxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingcalendar {

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
		driver.findElement(By.xpath("//a[text()='Calendar']")).click();		

		String date = "8-July-2017";
		
		String dateArray[] = date.split("-"); //18-september-2017
		
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[4]
		
		String beforexpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";		
		String afterxpath = "]/td[";	
		final int totalweekdays = 7;
		
		boolean flag = false;

		for(int rowNum=2;rowNum<=7;rowNum++) {			
			for(int colNum=1;colNum<=totalweekdays;colNum++) {
				String totalnumberofdays = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();			
				System.out.println(totalnumberofdays);
				
		
		}		
	}

	}
}
