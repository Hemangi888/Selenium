package Day14;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try 
		{
			int a[] = new int[5];
			a[5] = 20/0;
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		finally
		{
			System.out.println("Welcome");
		}
		
	}
}
