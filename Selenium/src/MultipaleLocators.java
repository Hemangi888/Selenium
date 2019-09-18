

	import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class  MultipaleLocators {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
			WebDriver driver = new ChromeDriver ();
			
			driver.get("https://www.wufoo.com/html5/maxlength-attribute/");
			Thread.sleep(1000);
			
			Properties obj = new Properties();
			FileInputStream objfile = new FileInputStream("C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//MyFile.Properties");
			obj.load(objfile);
			
			By input=By.xpath(obj.getProperty("Value"));
			WebElement text=driver.findElement(input);
			text.clear();
			text.sendKeys("Welcome Java Script");
			Thread.sleep(1000);
			

			By input1=By.xpath(obj.getProperty("Value2"));
			WebElement textarea =driver.findElement(input1);
			textarea.clear();
			textarea.sendKeys("Welcome Java Script");
			Thread.sleep(1000);
			
		
			System.out.println("First Value " +text.getAttribute("maxlength"));
			System.out.println("Second Value " +textarea.getAttribute("maxlength"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 4500)");  
			
			
			
		}

	}


