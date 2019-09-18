package Today;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginWithExcel {
	static SimpleDateFormat date = new SimpleDateFormat("dd_MM_yy_mm_ss");
	static Date date1 =  new Date();
	static File dest;
	static String curr_date = date.format(date1);
	static ExtentTest test;
	
	public static void main(String[] args) throws IOException, Exception {
		File file = new  File("C://Heena//LoginData..xls");
		FileInputStream input = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		System.out.println("Worksheet is created");
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(username);
		System.out.println(password);
		Thread.sleep(2000);
		
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(username);;
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(1000);
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dest = new File(System.getProperty("user_dir")+ "//img" +curr_date+".png");
		FileHandler.copy(Screenshot, dest);
		ExtentReports report = new ExtentReports("C:\\Heena\\ExtentReport.html");
		report.loadConfig(new File(System.getProperty("C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//extent-config.xml")));
		test=report.startTest("demo");	
		String ExpectedTile = "sndkjfnkjf";
		if(driver.getTitle().equals(ExpectedTile))
		{
			test.log(LogStatus.PASS,"demo1");
		}
		else
		{
			test.log(LogStatus.FAIL,"demo1");
		}
		report.endTest(test);
		report.flush();
	
		
	}
}
