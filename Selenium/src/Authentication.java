import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication {
	 public static void main(String[] args) throws InterruptedException, IOException {

			System.setProperty("webdriver.gecko.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//GeckoDriver//geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get("http://the-internet.herokuapp.com/basic_auth");
			
			Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//Authentication.exe");	
			
			

		
		
	}
}
