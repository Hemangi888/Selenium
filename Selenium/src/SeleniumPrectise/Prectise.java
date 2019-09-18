package SeleniumPrectise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prectise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		
		driver.navigate().to("http://the-internet.herokuapp.com");;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/context_menu']")).click();;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='hot-spot']")).click();
		Thread.sleep(1000);
		

		driver.navigate().to("http://the-internet.herokuapp.com");;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		Thread.sleep(1000);
		
		Select drp = new Select(driver.findElement(By.id("dropdown")));
		drp.selectByVisibleText("Option 2");
	
	
	}
}
