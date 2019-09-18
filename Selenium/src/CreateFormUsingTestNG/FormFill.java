package CreateFormUsingTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class FormFill {
	
	@BeforeSuite
	public void HitURL()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	

}
