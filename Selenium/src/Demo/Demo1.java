package Demo;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		Date date = new Date();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy_MM_dd_HH_MM_ss");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		By input = By.xpath("//input[@class='gLFyf gsfi']");
		WebElement searchElement = driver.findElement(input);
		Thread.sleep(2000);
		
		searchElement.sendKeys("Selenium");
		Thread.sleep(4000);
		WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
		searchButton.click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C://hello/SoftwareTestingMaterial"+dateFormat1.format(date)+".png"));
		driver.quit();
		
}
}
