package Demo;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitDemo {
	public static void main(String[] args) throws InterruptedException, TimeoutException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(1000);	
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
		
			wait.until(ExpectedConditions.titleContains("HTML5 Forms: MaxLength Type Attribute | Wufoo"));
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The  Title of the Page is"+driver.getTitle());
		}
	}

}
