package SeleniumPrectise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitProgram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");

	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vidhita");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("gohil");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prinseshemangi");
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("vidhi&888");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vidhi&888");
	
	Thread.sleep(9000);
	driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("prinseshemangi");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vidhi&888");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	driver.quit();
	
}

}
