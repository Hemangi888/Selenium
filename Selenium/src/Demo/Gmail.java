package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	
	By input = By.xpath("//input[@class='gLFyf gsfi']");
	WebElement searchElement = driver.findElement(input);
	Thread.sleep(1000);
	
	searchElement.sendKeys("www.gmail.com");
	Thread.sleep(1000);
	WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
	searchButton.click();
	Thread.sleep(1000);
	
	By input2 = By.xpath("//div[contains(text(),'Login to Google - Sign in - Google Accounts')]");
	WebElement searchElement1 = driver.findElement(input2);
	searchElement1.click();
	Thread.sleep(1000);
	
	By input3 = By.xpath("//input[@id='identifierId']");
	WebElement searchElement2 = driver.findElement(input3);
	Thread.sleep(1000);
	searchElement2.sendKeys("hemangigharania58@gmail.com");
	Thread.sleep(1000);
	
	WebElement searchButton1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	searchButton1.click();
	Thread.sleep(2000);
	
	By input4 = By.xpath("//input[@type='password']");
	//By input4= By.xpath("//input[@name='password']");
	WebElement searchElement3 = driver.findElement(input4);
	//Thread.sleep(1000);
	searchElement3.sendKeys("hemangi&888");
	Thread.sleep(2000);
	WebElement searchButton2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	searchButton2.click();
	Thread.sleep(2000);
	

}
}