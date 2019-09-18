

public class Bitwiseop {

		static int num1 = 1, num2 = 2, num3 =0;
		 public static void main(String args[]) {
		
			
			 
		  //Bitwise AND
		  System.out.println("num1 & num2 = " + (num1 & num2));
		  
		  //Bitwise OR
		  System.out.println("num1 | num2 = " + (num1 | num2) );
		  
		  //Bitwise XOR
		  System.out.println("num1 ^ num2 = " + (num1 ^ num2) );
		  
		  //Binary Complement Operator
		  System.out.println("~num1 = " + ~num1 );

		  //Binary Left Shift Operator
		  num3 = num1 <<  2;
		  System.out.println("num1 << 1 = " + num3 );

		  //Binary Right Shift Operator
		  num3 = num1 >>  2;
		  System.out.println("num1 >> 1  = " + num3 );

		  //Shift right zero fill operator
		  num3 = num1 >>> 2;
		  
		  System.out.println("num1 >>> 1 = " + num3 );
		  
		 }
		

}
