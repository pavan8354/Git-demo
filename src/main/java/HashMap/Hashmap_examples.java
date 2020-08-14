package HashMap;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmap_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");
//
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
//		driver.findElement(By.xpath("//input[@type='submit'and @value='Login']")).click();
		
		System.out.println(getcredentialsmap());
		System.out.println(getcredentialsmap().get("customer credentials"));
	
//		String credentials_user = getcredentialsmap().get("customer credentials");
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer credentials"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("customer credentials"));
		
	}
	
	public static  HashMap<String, String> getcredentialsmap() {
		
		HashMap<String,String> usermap = new HashMap<String,String>();
		
		usermap.put("customer credentials", "naveenautomation:Batch@123");
		usermap.put("delievery credentials", "naveenautomation1:Batch@1123");
		usermap.put("manager credentials", "naveenautomation2:Batch@1223");
		usermap.put("stock credentials", "naveenautomation3:Batch@1233");
		usermap.put("floor credentials", "naveenautomation4:Batch@1234");
		
		return usermap;
	}
		
		public static String getUserName(String role) {
			
			String credentials_user = getcredentialsmap().get(role);
			return credentials_user.split(":")[0];
			
		}
public static String getUserPassword(String role) {
			
			String credentials_user = getcredentialsmap().get(role);
			return credentials_user.split(":")[1];
			
		}
		
	}

