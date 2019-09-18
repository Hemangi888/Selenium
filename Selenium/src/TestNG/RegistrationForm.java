package TestNG;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class RegistrationForm {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void A_FirstMethod()
	{
		System.setProperty("webdriver.chrome.driver","C://Heena//Assesment//Driver//ChromeDriver//chromedriver.exe");
		driver = new  ChromeDriver();
		System.out.println("Before Method Called");
		
	}
	@Test
	public void B_Secound()
	{
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		System.out.println("second");
	}
	@Test
	public void C_Formfill() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hemangi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gharania");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Bilimora");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hemangigharania58@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9998867504");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		Select drop = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		drop.selectByValue("SQL");
		Select drop1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		drop1.selectByValue("India");	
		Select drop2 = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		drop2.selectByValue("1997");
		Thread.sleep(2000);
		Select drop3 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		drop3.selectByValue("April");
		Select drop4 = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		drop4.selectByValue("15");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("heenaFSDF123@");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("heenaFSDF123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	/*	String title="Register";
			if(driver.getTitle().equals(title))
			{
				test.log(LogStatus.PASS,"test1");
			}
			else
			{
				test.log(LogStatus.FAIL,"test1");
			}*/
		}

		
		/*@Test
		public void E_ExtentReport()
		{
				report = new ExtentReports("C//heena//ExtentReport.html");
				report.loadConfig(new File(System.getProperty("user.dir")+".xml"));
				test = report.startTest("demo");
		}*/
	
		@AfterTest
		public void close()
		{
			//report.endTest(test);
		//	report.flush();
			driver.close();	
		}
	
}
