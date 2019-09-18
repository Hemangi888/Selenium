package day1;


class Addition1
{
	 int a = 10;
	 int b = 20;
	 int c;
	public  void   ADD()
	{
		c =a + b;
		System.out.println(c);
	
	}
	
	
	String return1()
	{
		String name = "hemangi";
		return name;
	}
	
	
	public static void main(String args[])
	{
		Addition1 ad = new Addition1();
		ad.ADD();
		String s = ad.return1();
		System.out.println("Return  " +s);
		
	}
	
	
}