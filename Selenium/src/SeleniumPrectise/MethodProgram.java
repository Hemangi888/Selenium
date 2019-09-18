package SeleniumPrectise;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MethodProgram {
	 ExtentReports report = new ExtentReports("C://hello/res.html");
	 ExtentTest test;
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		MethodProgram m = new MethodProgram();
		m.BrowserLuanch();
		m.CreateAccount();
		m.ResultReport();
	}
 public void BrowserLuanch() {


	 
	 
	 driver.manage().window().maximize();
	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	 
	 test=report.startTest("BrowserLuanch");
	 test.log(LogStatus.INFO, "BrowserLuanch succesfully");
	}
 public void ResultReport()
 {	
	
	 report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	 test = report.startTest("Test");
	 if(driver.getTitle().equals("Google Account")) 
	 {
		 test.log(LogStatus.PASS,"Entered");
		 System.out.println("test pass");
	 }					
	 else
	 {
		 test.log(LogStatus.FAIL,"Entered");
		 System.out.println("test Fail");
		 	 
		 
	 }
	 
	 report.endTest(test);
	 report.flush(); 
	 
 }
 
 public void CreateAccount() throws InterruptedException
 {
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vidhita");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("gohil");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prinseshemangi");
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("vidhi&888");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vidhi&888");
	Thread.sleep(9000);
	driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("prinseshemangi");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vidhi&888");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	test=report.startTest("login");
	test.log(LogStatus.INFO, "log in success");
	Thread.sleep(2000);
	if (driver.getTitle().equals("Google Account")){
		
		System.out.println("Test passed");
	}
	else{
		System.out.println("no action");
	}
	
}
}
