package Day8;

public class Stringdemo {
	public static void main(String args[])
	{
		
		char[] arrayname={'h','E','E','n','A'};
		int [] arr={1,2,3};
		String S = "my favorite";
		System.out.println("java is " + S + " language");
		String name = new String(arrayname);
		System.out.println(name.charAt(3));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name);
		int Len = name.length();
		System.out.println(Len);
		System.out.println(arr[]);
		
	}
}


