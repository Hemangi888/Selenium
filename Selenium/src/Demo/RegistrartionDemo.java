package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrartionDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		

		By input = By.xpath("(//input[@type='text'])[1]");
		WebElement textbox= driver.findElement(input);
		textbox.sendKeys("Heena");
		Thread.sleep(2000);
		
		By input2 = By.xpath("(//input[@type='text'])[2]");
		WebElement lastname= driver.findElement(input2);
		lastname.sendKeys("Patel");
		Thread.sleep(2000);
		
		By input3 = By.xpath("(//input[@type='password'])[1]");
		WebElement Password= driver.findElement(input3);
		Password.sendKeys("hina&888");
		Thread.sleep(2000);
		
		By input4 = By.xpath("(//input[@type='text'])[3]");
		WebElement user= driver.findElement(input4);
		user.sendKeys("heenapatel58");
		Thread.sleep(2000);
		
		By input5 = By.xpath("(//input[@type='password'])[2]");
		WebElement conpass= driver.findElement(input5);
		conpass.sendKeys("hina&888");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		
		
	}

}
