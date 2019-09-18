package Day14;

public class StringException {
public static void main(String[] args) {
	String s = null;
	System.out.println(s.length());
	try
	{
		int num = Integer.parseInt("hemangi");
		System.out.println(num);
	   }
		catch(Exception e)
		{

		}
	try
	{
		int num;
		num = 30/0;
		System.out.println(num);
		
	}
	catch(Exception e2)
	{
		System.out.println("can not devide by zero");
	}
	finally
	{
		System.out.println("Welcome");
	}
	

}
}
