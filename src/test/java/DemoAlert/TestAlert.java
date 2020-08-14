package DemoAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class TestAlert {
 
    @Test
    public void TestAL() throws InterruptedException{
 
        // Load Firefox browser
 
    	System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
    	WebDriver driver=new ChromeDriver();
 
       // Open KSRTC website
 
        driver.get("http://www.ksrtc.in/site/");
 
        // Maximize the window
 
        driver.manage().window().maximize();
 
        // Click on Search Availability Service button
 
        driver.findElement(By.xpath(".//*[@id='Table_3']/tbody/tr[1]/td[2]/div/a")).click();
 
        // Switch to alert window and capture the text and print
 
        System.out.println(driver.switchTo().alert().getText());
 
        // Pause testcase for 5 second
 
          Thread.sleep(5000);
 
        // click on ok button
 
        driver.switchTo().alert().accept();
 
        // Close browser
 
        driver.quit();
    }
}