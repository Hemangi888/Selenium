package Prectise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyClass {
	WebDriver  driver;
	@BeforeSuite
	public void A_FirstMethod()
	{
		System.getProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void B_SecondMethod()
	{
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	

}
