package Day14;

public class AllException {
	public static void main(String[] args) {
		try 
		{
			System.out.println("try Block");
			throw new NullPointerException("Null Occured");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		try
		{
			int a;
			a = 30/0;
		}
		catch(Exception e)
		{
			System.out.println("Not Devided by Zero");
		}
		try
		{
			
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e1)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("Finally Block ");
		}
		
	}
	
	
}
