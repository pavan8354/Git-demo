package Barcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;


public class barcodegenerator {
	
	WebDriver driver;
	
	@Test
	public void barcodereader() throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://barcode.tec-it.com/en/");
		
		String barcodeurl =driver.findElement(By.tagName("img")).getAttribute("src");
		
		System.out.println(barcodeurl);
		
		URL url = new URL(barcodeurl);
		
		BufferedImage bgi = ImageIO.read(url);
		
		LuminanceSource lis = new BufferedImageLuminanceSource(bgi);
	
		BinaryBitmap bits = new BinaryBitmap(new HybridBinarizer(lis));
		
		Result result = new MultiFormatReader().decode(bits);
		
		System.out.println(result);
	}

}
