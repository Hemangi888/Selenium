package PrectiseDemo;

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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyExample {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	File dest;
	SimpleDateFormat   date = new SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date1 = new Date();
	String Curr_date = date.format(date1);	
	
	public  void a_LaunchBrowser()
	{
		System.out.println("Brfore Suite Method  called");
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	

	public void b_HITURL() throws IOException
	{
		driver.get("http://demo.automationtesting.in/Register.html");
		
		String ActualTitle = "bfdhjbhj";
		if(driver.getTitle().equals(ActualTitle))
		{
			test.log(LogStatus.PASS,"test1");
		}
		
		else
		{
			test.log(LogStatus.FAIL,"test1");
		}	
		d_GetScreenshot();
	}
	public void d_GetScreenshot() throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest = new File(System.getProperty("user.dir") + "//img" +Curr_date+".png");
		FileHandler.copy(file, dest);
	}
	public void b_ExtentReportMethod()
	{
		report=new ExtentReports("C://ExtentReport//File1.html");
		report.loadConfig(new File (System.getProperty("user_dir")+"\\extent-config.xml"));
		test = report.startTest("Test1");
	}

	public void f_CloseBrowser()
	{
		report.endTest(test);
		report.flush();
		driver.close();
	}

}
