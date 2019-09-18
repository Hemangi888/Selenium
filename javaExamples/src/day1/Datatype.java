package day1;



public class Datatype {
	int a;
	char b = 'H';
	String s = "Hemangi";
	boolean bl;
	float f = 32;
	short st = 23456;
	long l = 1234567891;
	double dl;
	void Integer()
	{
		System.out.println ("Integer: "+a);
	}
	
	void Char()
	{
		System.out.println("Character: "+b);
	}
	
	void String()
	{
		System.out.println("String: "+s);
	}
	
	void Float()
	{
		System.out.println("Float: "+f);
	}
	
	void Short()
	{
		System.out.println("Short: "+st);
	}
	
	void Long()
	{
		System.out.println("Long: "+l);
	}
	
	void  Boolean()
	{
		System.out.println("Boolean: "+bl);
	}
	
	void Double()
	{
		System.out.println("Double: "+dl);
	}
	

	
	
	public static void main(String args[])
	{
		Datatype d = new Datatype();
		d.Integer();
		d.Char();
		d.Float();
		d.String();
		d.Long();
		d.Short();
		d.Double();
		
	}

}
