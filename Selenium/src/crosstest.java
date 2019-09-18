import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crosstest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://online2pdf.com");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();	
		*/
		 
			
			System.setProperty("webdriver.ie.driver","C://Users//hemangi.gharaniya//Documents//Hemangi//workspace//Selenium//IEDriver//IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://online2pdf.com");
			driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();	
		

		
	}

}
