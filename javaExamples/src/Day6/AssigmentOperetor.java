package Day6;

public class AssigmentOperetor {
	public  static void main(String args[])
	{
		int a = 9;
		int b = 20;
		System.out.println("Equal To: "+(a=b));
		System.out.println("Add and  assigment operator: "+(a+=b));
		System.out.println("Substract and  assigment operator: "+(a-=b));
		System.out.println("Multiply and  assigment operator: "+(a*=b));
		System.out.println("Division and assigment operator: "+(a/=b));
		System.out.println("Modulus Add assigment operator: "+(a%=b));
		System.out.println("Right shift  and operator: "+(a>>1));
		System.out.println("Left shift and operator : "+(a<<=2));
		System.out.println("Bitwise AND assignment operator.: "+(a&=b));
		System.out.println("bitwise exclusive OR and assignment operator.: "+(a^=b));
		System.out.println("bitwise inclusive OR and assignment operator. C: "+(a|=b));
		
		
	}

} 
