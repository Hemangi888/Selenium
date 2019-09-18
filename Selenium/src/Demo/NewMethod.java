package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewMethod {
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
		
		//driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='exp-0']")).click();
		Thread.sleep(2000);
		
	/*	try
		{
			driver.findElement(By.xpath("//input[@id='photo']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Element Not found");
		}*/
		//driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		//Thread.sleep(3000);
		
		///Select drp =  new Select (driver.findElement(By.xpath("//select[@id='continents']")));
		//drp.selectByVisibleText("Antartica");
		
		
		List<WebElement> abc = driver.findElements(By.xpath("//input[@name='profession']"));
		String value = "Automation Tester,Menual Tester,";
		
		List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));

		for(String check : list)
		{
			for(WebElement chk : abc)
			{
				if(chk.getAttribute("value").equalsIgnoreCase(check));
				chk.click();
				Thread.sleep(3000);
			}
		}
		

		List<WebElement> abc1 = driver.findElements(By.xpath("//input[@name='profession']"));
		String value1 = "QTP,Selenium IDE,Selenium Webdriver,";
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(value.split(",")));

	
	}

}
