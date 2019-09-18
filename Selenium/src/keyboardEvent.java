import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		Actions builder = new Actions(driver);
		 
		//Generating an action to type a text in CAPS
		Action typeInCAPS = builder.keyDown(By.xpath("//input[@class='gLFyf gsfi']"), Keys.SHIFT)
	
				typeInCAPS.sendKeys("artOfTesting");
				     .keyUp(By.xpath("//input[@class='gLFyf gsfi']"), Keys.SHIFT)
		        	     .build();

		//Performing the typeInCAPS action
		typeInCAPS.perform();
}
}