package SeleniumPrectise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemoProgram {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//GeckoDriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/javascript4.htm");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@value='alert box']")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click();
		Thread.sleep(2000);
		Alert b = driver.switchTo().alert();
		b.dismiss();

		driver.findElement(By.xpath("//input[@value='prompt box']")).click();
		Thread.sleep(2000);
		
		Alert c = driver.switchTo().alert();
		c.sendKeys("Hello");
		Thread.sleep(2000);
		c.dismiss();	
}
}