package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://docs.google.com/forms/d/1_XlZc1RlKAgL7iDFtCf5tQOwTtm8wsHyCUAoa68Klhs/edit");
		Thread.sleep(1000);
		
		WebElement textbox= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.click();
		Thread.sleep(2000);
		
		By input3 = By.xpath("(//input[@type='text'])[1]");
		WebElement text = driver.findElement(input3);
		Thread.sleep(1000);
		
		text.sendKeys("Welcome");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Option 1")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.partialLinkText("Option 1")).click();
		driver.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[2]/div[4]/div/div[2]/div[1]/div/label/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
	
			}

}
