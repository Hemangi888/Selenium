package Freamwork;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class autodemo {
	static WebDriver driver;
	ExtentReports report;
	ExtentTest test;
public void A_launch()
{
	System.out.println("Brfore Suite Method  called");
	System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
public void B_HitURL() throws InterruptedException
{
	Thread.sleep(2000);
	driver.get("http://automationpractice.com/index.php");
}

public void C_ExcelRead() throws IOException
{
	File file = new File("C://Heena//ExcelData//Excelread.xls");
	FileInputStream input = new FileInputStream(file);
	HSSFWorkbook wb = new HSSFWorkbook(input);
	HSSFSheet sheet = wb.getSheetAt(0);
	
	System.out.println("worksheet is created");
	
	String username = sheet.getRow(1).getCell(0).getStringCellValue();
	String password = sheet.getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(username);
	System.out.println(password);
	
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
	
	String ExpectedTitle = "Login - My Store";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ExpectedTitle,ActualTitle);
	test.log(LogStatus.PASS,"test1");
	
}
public void ExtentReport()
{
	report = new ExtentReports("C//heena//ExtentReport.html");
	report.loadConfig(new File(System.getProperty("user.dir")+"config.xml"));
	test=report.startTest("demo1");
	
}
public void EndTest()
{
	report.endTest(test);
	report.flush();
	
}
}
