package AssesmentPrectise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("www.google.com");
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	}

}
