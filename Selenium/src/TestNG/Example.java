package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver;
	@BeforeSuite
	public  void a_LaunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chorme.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@BeforeTest
	public void b_HITURL()
	{
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void c_Test1()
	{
		System.out.println("method called");
	}
	

}

