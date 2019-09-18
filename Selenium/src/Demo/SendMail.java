package Demo;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SendMail {
	static ExtentTest test;
	static ExtentReports report;
	
	public static void main(String[] args) throws InterruptedException {
		report = new ExtentReports("C:\\hello" + "/Harmoniyam.html",true);
		report.loadConfig(new File(System.getProperty("user.dir") + "\\IEDriver\\config.xml"));
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		Thread.sleep(1000);
		
		By input3 = By.xpath("//input[@id='identifierId']");
		WebElement searchElement2 = driver.findElement(input3);
		Thread.sleep(1000);
		
		searchElement2.sendKeys("hemangigharania58@gmail.com");
		Thread.sleep(1000);
		
		WebElement searchButton1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		searchButton1.click();
		Thread.sleep(2000);
		
		By input4 = By.xpath("//input[@type='password']");
		WebElement searchElement3 = driver.findElement(input4);
		searchElement3.sendKeys("hemangi&888");
		Thread.sleep(2000);
		
		WebElement searchButton2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		searchButton2.click();
		Thread.sleep(2000);
		
		WebElement ComposeButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		ComposeButton.click();
		Thread.sleep(2000);
	
		
		By To = By.xpath("//div[@id=':u6']");
		WebElement to = driver.findElement(To);
		to.sendKeys("pujapatel1405@gmail.com");
		Thread.sleep(6000);
		
		WebElement subject = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subject.sendKeys("welcome");
		Thread.sleep(6000);
		
		WebElement SendButton = driver.findElement(By.xpath("//div[@id=':p0']"));
		SendButton.click();
		Thread.sleep(2000);
		
		report.endTest(test);
		report.flush();
}
}
