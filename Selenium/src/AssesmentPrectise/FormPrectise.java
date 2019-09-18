package AssesmentPrectise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPrectise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	//	WebDriverWait wait = new WebDriverWait(driver,20);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vipula");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Surti");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Bilimora");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vipulasurti@gmail.com");;
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9998867504");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		List<WebElement>profession = driver.findElements(By.xpath("//input[@type='checkbox']"));
		String value = "Cricket,Movies";
		List <String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		for(String check : list)
		{
			for(WebElement chk : profession)
			{
				if(chk.getAttribute("value").equalsIgnoreCase(check))
				{
					chk.click();
				}
			}
		}
		
	}

}
