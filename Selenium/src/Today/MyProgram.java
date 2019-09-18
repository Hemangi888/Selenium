package Today;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyProgram {
	WebDriver driver;
	File dest;
	ExtentReports report;
	ExtentTest test;
	/*SimpleDateFormat date = new  SimpleDateFormat("dd_MM_yy_mm_ss");
	Date  date1 = new Date();
	String curr_date = date.format(date1);*/
	SimpleDateFormat sf = new SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date = new Date();
	String curr_date = sf.format(date);	
	
	
	@BeforeTest
	public void A_FirstMethod()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void B_SecondMethod()
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		//System.out.println("hello");
	}
	@Test
	public void C_ExtentReport()
	{
		report = new ExtentReports("C://Heena//Myreport00.html");
		report.loadConfig(new File(System.getProperty("user_dir")+"\\extent-config.xml"));
		test = report.startTest("demo");
	}
	@Test
	public void D_ThiredMethod() throws InterruptedException, IOException
	{
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
	//	D_GetScreenShot();
		String Title = "ghfter";
		if(driver.getTitle().equals(Title))
		{
			test.log(LogStatus.PASS,"demo1");
		}
		else
		{
			E_GetScreenShot();
			String loc = System.getProperty("user.dir")+"//new_img"+curr_date+".png";
			test.log(LogStatus.FAIL,"test1 see below for sacreen shot"+test.addScreenCapture(loc));
		//	test.log(LogStatus.FAIL,"demo1");
		}
			
			
	}
	@Test
	public void E_GetScreenShot() throws IOException
	{
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest = new File(System.getProperty("user.dir")+"//new_img"+curr_date+".png");
		FileHandler.copy(screenshotFile, dest);
		
	}
	
	
	@AfterTest
	public  void F_CloseBrowser()
	{
		report.endTest(test);
		report.flush();
		driver.close();
	}
}
