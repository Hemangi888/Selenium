package Day6;

public class BitwiseOperator {
	public static void  main(String args[])
	{
		int a = 2;
		int b = 3;
		System.out.println("Compliment : "+(~b));
		System.out.println("Bitwise And Operator: "+(a&b));
		System.out.println("Bitwise Or Operator: "+(a|b));
		System.out.println("Bitwise XOR Operator: "+(a^b));
		System.out.println("Bitwise Left shift: "+(a<<3));
		System.out.println("Bitwise Right shift: "+(a>>2));
		System.out.println("Zero fill right shift: "+(a>>>2));
	}

}
