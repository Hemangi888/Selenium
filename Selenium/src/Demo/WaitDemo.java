package Demo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WaitDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get(" http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Hemangi");
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullimg = ImageIO.read(src);
		org.openqa.selenium.Point point = name.getLocation();
		
		int namehight = name.getSize().getHeight();
		
		BufferedImage nameScreenshot = fullimg.getSubimage(point.getX(),point.getY(), namehight, namehight);
		ImageIO.write(nameScreenshot,"png",src);
		try
		{
			FileHandler.copy(src,new File("C://hello/SoftwareTestingMaterial.png"+System.currentTimeMillis()+".png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		driver.close();		
	}
	
}
