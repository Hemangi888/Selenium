package SeleniumPrectise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("http://demo.guru99.com//test//delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Properties p = new Properties();
		FileInputStream obj = new FileInputStream("C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//src//SeleniumPrectise//Demo.properties");
		p.load(obj);
		
		By input = By.xpath(p.getProperty("Name"));
		WebElement e = driver.findElement(input);
		e.clear();
		Thread.sleep(2000);
		e.sendKeys("Hemangi");
		
		By input1 = By.xpath(p.getProperty("Submit"));
		WebElement e1 = driver.findElement(input1);
		e1.click();
		Thread.sleep(2000);
		
	}

}
