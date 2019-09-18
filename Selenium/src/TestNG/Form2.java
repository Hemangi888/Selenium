package TestNG;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Form2 {
	
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
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			System.out.println("second");
		}
		
		@Test
		public void C_Formfill() throws InterruptedException, IOException
		{
			driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
			driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("test.1rivet@milinator.com");
			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("1rivet");
			driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
			driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
			String image = driver.findElement(By.cssSelector("img")).getText();
			System.out.println("Image names ="+image);
		}
		/*@AfterTest
		public void close()
		{
			//driver.close();
		}*/
	}



