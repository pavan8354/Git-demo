package testnglistner;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Takescreenshot extends Base {
	
	@BeforeTest
	
	public void setup() {
		initialization();
		
	}

	@AfterTest
	
	public void teardown() {
		
		driver.quit();
		
	}
	

	@Test
public void loginpage() {
		
		Assert.assertEquals("Facebook – log in or sign up", "Facebook");
		
	}
	@Test
public void signinpage() {
	
	Assert.assertEquals(false, true);
	
}
	@Test
	public void signoutpage() {
		
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void homepage() {
		
		Assert.assertEquals(false, true);
		
	}
}
