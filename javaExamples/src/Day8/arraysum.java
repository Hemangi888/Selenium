//below program  show the sum of  interger array
package Day8;

public class arraysum {
	public static void main(String[] args) 
	{
		int sum = 0;
		int a[] = {3,4,5,-5,0,12};
		for(int i : a)
		{
			sum = sum + i;
		}
		System.out.println("Sum of Integer Array " +sum);
	}
}