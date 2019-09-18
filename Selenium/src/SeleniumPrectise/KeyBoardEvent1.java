package SeleniumPrectise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https:\\www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		Thread.sleep(3000);
//Create Action Class  to Perform Keyboard  event and mouse event
		Actions act = new Actions(driver);
//To Perform Enter operation using  Return keyword
		act.sendKeys(Keys.RETURN).perform();	
		act.moveToElement(driver.findElement(By.xpath("//a[@id='abar_button_opt']"))).perform();
//To Perform  ScrollBy  operation 
		driver.navigate().to("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
//To Perform Tab Key Operation 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("Hemangi");
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).perform();
//To Perform KeyUp and KeyDown operation
		act.keyDown(Keys.SHIFT).perform();
		driver.findElement(By.xpath("//textarea[@name='text2']")).sendKeys("heena");
		act.keyUp(Keys.SHIFT);
//To Perform contextClick Event
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
	    System.out.println("Right click Context Menu displayed");
//To Perform Download  Event
	    act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
	    Alert a = driver.switchTo().alert();
		a.accept();	
	}
}

