package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FormFillProgram {
	WebDriver driver;
	Properties pro;
	File dest;
	ExtentReports report;
	ExtentTest test;
	SimpleDateFormat date = new SimpleDateFormat("dd_MM_yy_mm_ss");
	Date date1 = new Date();
	String curr_date = date.format(date1);
	
	
	@BeforeSuite
	public void a_LaunchBrowser()
	{
		System.out.println("Brfore Suite Method  called");
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@BeforeTest
	public void b_HitRrl() throws InterruptedException, IOException
	{
		
		driver.get("http://demo.automationtesting.in/Register.html");
		c_formfill();
		
	
	}
	public void c_formfill() throws IOException
	{
		pro = new Properties();
		FileInputStream file = new FileInputStream("C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//src//CreateFormUsingTestNG//Form.properties");
		pro.load(file);
	}
	
	@BeforeTest
	public void ExtentReport()
	{
		report = new ExtentReports("C://Heena//MyReport.html");
		report.loadConfig(new File(System.getProperty("user_dir")+"\\extent-config.xml"));
		test = report.startTest("Demo");
	}
	
	@Test
	public void d_WriteData() throws InterruptedException
	{
		driver.findElement(By.xpath(pro.getProperty("Full_name"))).sendKeys("Vipula");
		driver.findElement(By.xpath(pro.getProperty("Last_name"))).sendKeys("Surti");
		driver.findElement(By.xpath(pro.getProperty("Address"))).sendKeys("Valsad");
		driver.findElement(By.xpath(pro.getProperty("Email_address"))).sendKeys("surtivipula@gmail.com");
		driver.findElement(By.xpath(pro.getProperty("Gender"))).sendKeys("Female");
		driver.findElement(By.xpath(pro.getProperty("Gender"))).click();
		driver.findElement(By.xpath(pro.getProperty("PhoneNo"))).sendKeys("9998867504");
		Thread.sleep(1000);
			List <WebElement> profession = driver.findElements(By.xpath(pro.getProperty("Checkbox")));
			String value = "Cricket,Movies";
			List <String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
			System.out.println(list);
			for(String check : list)
			{
				for(WebElement chk : profession)
				{
					if(chk.getAttribute("value").equalsIgnoreCase(check))
					{
						chk.click();
					}
				}
			
			}
			String ActualTile = "kfgkg";
			if(driver.getTitle().equals(ActualTile))
			{
				test.log(LogStatus.PASS,"test1");
			}
			else
			{
				test.log(LogStatus.FAIL,"test1");
			}
	}
			
			@Test
			public void e_Language() throws InterruptedException
			{
				driver.findElement(By.xpath(pro.getProperty("Language"))).click();
				driver.findElement(By.xpath(pro.getProperty("DroupDown"))).click();
				//Thread.sleep(2000);
			}
			
			@Test
			public void f_Dropdown() throws InterruptedException
			{
				Thread.sleep(2000);
				Select drop = new Select(driver.findElement(By.xpath(pro.getProperty("Skills"))));
				drop.selectByIndex(4);
			
			}
			
			@Test
			public   void g_DroupDown()
			{
				Select drop = new Select(driver.findElement(By.xpath(pro.getProperty("Country"))));
				drop.selectByIndex(4);
			}
			
			@Test
			public   void h_DroupDown()
			{
				driver.findElement(By.xpath(pro.getProperty("ComboBox"))).click();
				driver.findElement(By.xpath(pro.getProperty("Country"))).click();
			
			}
			
			@Test
			public   void i_DroupDown()
			{
				Select drop = new Select(driver.findElement(By.xpath(pro.getProperty("year"))));
				drop.selectByValue("1997");
			}
			@Test
			public   void j_DroupDown()
			{
				Select drop = new Select(driver.findElement(By.xpath(pro.getProperty("month"))));
				drop.selectByIndex(4);
			}
			
			
			@Test
			public   void k_DroupDown()
			{
				Select drop = new Select(driver.findElement(By.xpath(pro.getProperty("day"))));
				drop.selectByIndex(15);
			}
			
			@Test
			public   void l_FileUpload() throws IOException, InterruptedException
			{
				System.out.println("Run Program");
				driver.findElement(By.xpath(pro.getProperty("FileUpload"))).click();
				Thread.sleep(2000);
				Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//FormFileUpload.exe");
			//	driver.navigate().to("www.gmail.com");
				Thread.sleep(2000);
			}
			
			@Test
			public void screenshot() throws IOException
			{
				File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				dest = new File(System.getProperty("user.dir") + "//img" +curr_date+".png");
				FileHandler.copy(ScreenshotFile,dest);
			}
			
			@Test
			public void m_GmailPage() throws InterruptedException
			{
				driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				
				Thread.sleep(2000);
			}
			@AfterTest
			public void Report()
			{
				driver.close();
				report.endTest(test);
				report.flush();
			}
						
	}


