import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class FileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver","C:////Users////hemangi.gharaniya////Documents////Hemangi////workspace////Selenium////GeckoDriver////geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/download']")).click();
		Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//FileDownload.exe");
	}
	
		
		//driver.findElement(By.linkText("[@href='/download'])")).click();
	}

