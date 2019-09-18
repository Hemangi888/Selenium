package Today;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//GeckoDriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		//Runtime.getRuntime().exec("C://Heena//Autho.exe");
	
		
	}

}
