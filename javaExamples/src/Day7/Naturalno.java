/*below program shows the sum of natural numbers.
 in this program while loop  first check the condition and if condition '
 is true then execute the  while loop body statement and if 
condition is false then the loop will be terminated.
*/


package Day7;

public class Naturalno {
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		while(i<=100)
		{
			sum = sum+i;
			i++;
		
		}
		System.out.println(sum);
		
	}

}
