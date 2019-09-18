package SeleniumPrectise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions  act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		driver.navigate().to("http://demo.guru99.com//test//delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");

		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();
		Thread.sleep(1000);
		
		Alert conformationAlert = driver.switchTo().alert();
		String alertText = conformationAlert.getText();
		conformationAlert.accept();
	}

	}

