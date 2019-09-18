package AutoItPrectical;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMultipleFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://static.raymondcamden.com/demos/2013/sep/10/test0A.html");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@id='files']")).click();
		Thread.sleep(2000);
		
	    Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//save.exe" );	    
	}
		}
		
	


