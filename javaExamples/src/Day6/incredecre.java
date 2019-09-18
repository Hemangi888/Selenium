package Day6;

public class incredecre {
	int a = 2;
	int b = 3;
	int c;
	void incre()
	{
		
		System.out.println("Invrement operators"+a);
		++a;
		System.out.println("Invrement operators"+a);
		System.out.println("Invrement operators"+b);
		b++;
		System.out.println("Invrement operators"+b);
		c = a + b;
		System.out.println("Invrement operators"+c);
		
		System.out.println("Decrement");
		System.out.println("Invrement operators"+a);
		--a;
		System.out.println("Invrement operators"+a);
		System.out.println("Invrement operators"+b);
		b--;
		System.out.println("Invrement operators"+b);
		c = a - b;
		System.out.println("Invrement operators"+c);
		
	}
	
	public static void main(String args[])
	{
		incredecre i = new incredecre();
		i.incre();
		
	}

}
