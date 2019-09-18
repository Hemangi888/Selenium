package PrectiseDemo;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainClass  extends  MyExample{
	@BeforeSuite
	public void  A_BrowserLanuch() throws IOException
	{
		a_LaunchBrowser();
		
	}
	@Test
		public void B_Hiturl() throws IOException
		{
			b_HITURL();
		}
	
}
	
	
