import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class CrossBrowzer {
	public static void main(String[] args) throws InterruptedException {
/*		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(1000);

		driver1.get("https://docs.google.com/forms/d/1_XlZc1RlKAgL7iDFtCf5tQOwTtm8wsHyCUAoa68Klhs/edit");
		Thread.sleep(1000);
		driver1.quit();*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hemangi.gharaniya\\Documents\\Hemangi\\workspace\\Selenium\\GeckoDriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://docs.google.com/forms/d/1_XlZc1RlKAgL7iDFtCf5tQOwTtm8wsHyCUAoa68Klhs/edit");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//driver.quit();
/*
		
	    driver.get("https://docs.google.com/forms/d/1_XlZc1RlKAgL7iDFtCf5tQOwTtm8wsHyCUAoa68Klhs/edit");
		Thread.sleep(1000);
		driver.quit();
		
		System.setProperty("webdriver.ie.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//IEDriver//IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.manage().window().maximize();

		
		driver2.get("https://docs.google.com/forms/d/1_XlZc1RlKAgL7iDFtCf5tQOwTtm8wsHyCUAoa68Klhs/edit");
		Thread.sleep(1000);
		driver2.quit();*/
		
	}

}
