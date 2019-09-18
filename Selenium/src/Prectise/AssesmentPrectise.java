package Prectise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AssesmentPrectise {
	ExtentReports report;
	ExtentTest test;
	
	WebDriver driver;
	File dest;
	SimpleDateFormat date = new SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date1 = new Date();
	String curr_date = date.format(date1);
	
	@BeforeTest
	public void A_BeforeSuite()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeTest
	public void  B_url() throws InterruptedException, IOException
	{
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		String ActualTitle = "snfnfs";
		Thread.sleep(2000);
		if(driver.getTitle().equals(ActualTitle))
		{
			test.log(LogStatus.PASS,"Demo1");
			
		}
		else
		{
			test.log(LogStatus.FAIL,"Demo1");
		}
		
	}
	
	@Test
	public void C_GetScreenshort() throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest = new File(System.getProperty("user.dir") + "//img" +curr_date+".png");
		FileHandler.copy(file, dest);
	}
	
	
	@Test
	public void AfterMethod()
	{
		
		System.out.println("After Method called");
	}
	
	@Test
	public void D_ExtentReport()
	{
		report = new ExtentReports("C:\\hello\\Report1.html");
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		report.startTest("demo1");
	}
	
	
	@AfterTest
	public void CloseBrowser()
	{
		report.endTest(test);
		report.flush();
		driver.close();
		
	}

}
