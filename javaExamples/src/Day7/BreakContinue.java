/*below program 
 */*
 */
package Day7;


public class BreakContinue {
public static void main(String args[])
{
		int i;
		for(i=1;i<=5;i++)
		{
				System.out.println(i);
				if(i==3)
				{
					//System.out.println(i);
					break;
				}
				
		}
		
		for(i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				continue;
			
			}
			
		}
	
}
}
