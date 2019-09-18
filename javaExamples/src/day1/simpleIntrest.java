package day1;

public class simpleIntrest {
	int p =2000;
	int r = 5;
	int t = 3;
	float SI;
	void SimpleIntrest()
	{
		SI = (p*r*t)/100;
		System.out.println("SimpleIntrest  "+SI);
		
	}
	public static void main(String args[])
	{
		simpleIntrest S = new simpleIntrest ();
		S.SimpleIntrest();
		
	}
	
}
