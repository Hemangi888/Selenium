package Freamwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreamworkExample {
	static WebDriver driver;
	static Properties pro ;
	//Properties pro;
	public static void Url(String BrowserName,String URL)
	{
		if(BrowserName=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
		}
		else if(BrowserName=="IE")
		{
			System.setProperty("webdriver.inter.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//IFDriver//IEDriverServer.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
		}
		else if(BrowserName=="Gecko")
		{
			System.setProperty("webdriver.gecko.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//GeckoDriver//geckodriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
		}
		else
		{
			System.out.println("not valid");
		}
			
	}
	public static void Properties() throws IOException
	{
		//Properties pro = new Properties();
		pro = new Properties();
		FileInputStream input = new FileInputStream("C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//src//Freamwork//Locators.properties");
		pro.load(input);
	}
	
	public static void sendkey(String name,String value) throws IOException
	{
		Properties();
		driver.findElement(By.xpath(pro.getProperty(name))).sendKeys(value);
		
		
	}
	/*public void FillForm()
	{
		driver.findElement(By.xpath(pro.getProperty("FullName"))).sendKeys("Hemangi");
		//driver.findElement(By.xpath(pro.getProperty("Full_name"))).sendKeys("Vipula");
	}
	*/


}
