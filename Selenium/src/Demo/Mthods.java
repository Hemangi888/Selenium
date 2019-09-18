package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mthods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Hemangi");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.xpath("//input[@id='lastname']"));
		surname.sendKeys("Gharania");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("8/20/2019");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='exp-0']")).click();
		Thread.sleep(2000);
		
		List<WebElement> abc = driver.findElements(By.xpath("//input[@name='profession']"));
		String value = "Automation Tester,Menual Tester,";
		
		//List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();

		
		Select drp =  new Select (driver.findElement(By.name("continents")));
		drp.selectByVisibleText("Antartica");
		Thread.sleep(3000);
		
		drp.selectByIndex(2);
		Thread.sleep(1000);
		
	}
}
		