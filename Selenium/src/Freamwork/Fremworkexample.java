package Freamwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fremworkexample {
	WebDriver driver;
	static String  Chrome;
	static String  ie;
	static String  gecko;
	public void URL(String  name,String url)
	{
		if(Chrome=="name")
		{
				System.setProperty("WebDriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
				
		}
		else if(ie=="name")
		{
				System.setProperty("WebDriver.chrome.driver","");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
				
		}
		else if(gecko=="name")
		{
				System.setProperty("WebDriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//GeckoDriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
				
		}
	}
}
