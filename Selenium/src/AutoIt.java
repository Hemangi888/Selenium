import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com//basic-auth");
		driver.manage().window().maximize();
		
	  
		Thread.sleep(2000);
		try
		{
		
			Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//Demo.exe");	
		}
		catch(Exception  e)
		{
			e.getStackTrace();
		}
	}
	}


