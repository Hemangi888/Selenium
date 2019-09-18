package Today;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FullExamplePrectise {
	WebDriver driver;
	File dest;
	SimpleDateFormat date1 = new   SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date = new Date();
	String curr_date = date1.format()
	
	@BeforeTest
	public void A_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void B_HitUrl() throws InterruptedException
	{
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
	}
	@Test
	public void C_GetScreentshot()
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest =(new File( System.getProperty("user_dir")+ "img" +curr_date+".png"));
		FileHandler.copy(file,dest);
	}

}
