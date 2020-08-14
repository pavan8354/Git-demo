package Dynamicxpath;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class imagevalidation {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\JAVALEARN\\filewriting\\geckodriver.exe");	
		
		FirefoxOptions options = new FirefoxOptions();
		disablefirefoxoptions(options);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		
		
	}
		public static void disablechromeoptions(ChromeOptions options) {
			
			HashMap<String, Object> object = new HashMap<String, Object>();
			object.put("object", 2);
			
			HashMap<String, Object> pref = new HashMap<String, Object>();
			pref.put("profile_default_containing_setting_values", object);
			
			options.setExperimentalOption("prefs", pref);
		}
			public static void disablefirefoxoptions(FirefoxOptions options) {
				
				FirefoxProfile firefoxprofile = new FirefoxProfile();
				
				firefoxprofile.setPreference("permissions.default.image", 2);
				
				options.setProfile(firefoxprofile);
				options.setCapability(FirefoxDriver.PROFILE, firefoxprofile);
				
			
			
			
		}

		
	}
	
