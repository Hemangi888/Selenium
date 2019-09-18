package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxChar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(1000);
		
		By input = By.xpath("//input[@name='text']");
		WebElement textbox= driver.findElement(input);
		textbox.clear();
		Thread.sleep(2000);
		textbox.sendKeys("Welcome Java Script");
		Thread.sleep(1000);
		
		
		By input1 = By.xpath("//textarea[@maxlength='20']");
		WebElement textbox1= driver.findElement(input1);
		textbox1.clear();
		Thread.sleep(2000);
		textbox1.sendKeys("Welcome Java Script");
		Thread.sleep(1000);
		
		System.out.println("First Value " +textbox.getAttribute("maxlength"));
		System.out.println("Second Value " +textbox1.getAttribute("maxlength"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
		
		
		
	}

}
