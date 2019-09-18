package AutoItPrectical;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://online2pdf.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//FileUpload1.exe");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//FileUpload2.exe");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C://Users//hemangi.gharaniya//Documents//AutoIt//FileUpload3.exe");
		
	
		
		

}
}