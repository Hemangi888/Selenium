package day1;

class X {
	
	protected  int i = 12;
	void display()
	{
		System.out.println(i);
	}

}	
public class Sample2
{
	public void main(String args[])
	{
		X s = new X();
		s.display();
		System.out.println(s.i);
	}
}
