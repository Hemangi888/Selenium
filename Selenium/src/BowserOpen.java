import org.junit.Test;
import org.testng.annotations.BeforeSuite;

public class BowserOpen {
	
	@BeforeSuite
	public void b4suite()
	{
		System.out.println("b4 suite method");
	}
	
	@Test
	public void FirstTest()
	{
		System.out.println("This is my first test");
		
	}
	

}
