
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PrectiseDemo.MyExample;

public class testNG extends MyExample {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	ExtentTest test1;
	File dest;
	SimpleDateFormat sf = new SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date = new Date();
	String curr_date = sf.format(date);	
	
	@BeforeSuite()
	public void hitURL() throws InterruptedException {
		 a_LaunchBrowser();
		
		System.out.println("Brfore Suite Method  called");
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	@Test
	public void GmailPage() throws InterruptedException, IOException
	{
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		String actualTitle = "dfrcghhybhgdb";
		if(driver.getTitle().equals(actualTitle))
		{
			test.log(LogStatus.PASS,"test1");
		}	
		else
		{	
			GetScreenshot();
			String loc = System.getProperty("user.dir")+"img"+curr_date+".png";
			test.log(LogStatus.FAIL,"test1 see below for sacreen shot"+test.addScreenCapture(loc));
		
		}
	}
	
	@Test(priority = 3)
	public void YouTube() throws InterruptedException, IOException
	{
		driver.get("https://www.youtube.com");
		String actualTitle1 = "YouTube";
		Assert.assertEquals(driver.getTitle(),actualTitle1);
		Thread.sleep(2000);
		if(driver.getTitle().equals(driver.getTitle()))
		{
			
			test.log(LogStatus.PASS,"test3");
			
			
		}
		else
		{
			
			System.out.println("Fail");
		}
	}

	@Test(priority = 2)
	public void Click() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hemangigharania58@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("heena123");
		GetScreenshot();
		if(driver.getTitle().equals(driver.getTitle())){
			test.log(LogStatus.PASS, "test2");
			}
	}
	
	public void GetScreenshot() throws IOException
	{
			
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest = new File(System.getProperty("user.dir")+"img"+curr_date+".png");
		FileHandler.copy(screenshotFile, dest);
		
	}
	
	@BeforeTest
	public void ExtentReport()
	{
		report = new ExtentReports("C:\\Heena\\rep.html");
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		test=report.startTest("demo");
	}
	@AfterTest
	public void terminate() {
		driver.close();
		report.endTest(test);
		report.flush();	
	
	}
}