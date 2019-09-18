package Day6;

//import day1.Datatype;

public class DataType {
	int a;
	char b;
	String s;
	boolean bl;
	float f;
	short st;
	long l;
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
		System.out.println("Double: "+bl);
	}
	

	
	
	public static void main(String args[])
	{
		DataType d = new DataType();
		d.Integer();
		d.Char();
		d.Float();
		d.String();
		d.Long();
		d.Short();
		d.Double();
		
	}

}
