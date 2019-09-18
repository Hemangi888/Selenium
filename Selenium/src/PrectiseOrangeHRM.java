import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PrectiseOrangeHRM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hemangi11-trials65.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement pwd =	driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pwd.sendKeys("Heena&888");
		
		WebElement button =driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		Thread.sleep(2000);
	
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("(//span[@class='left-menu-title'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement admin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu_admin_viewAdminModule']")));
				
	//WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu_admin_viewAdminModule']")));
		admin.click();
		//(//span[@class="left-menu-title"])[2]
	//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[4]/ul/li[1]/a/span[2]")).click();
		
	}

}
