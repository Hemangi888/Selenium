package Day6;


class X
{
	protected int i = 12;
	//	create method here and print i value
	public void dispaly()
	{
		System.out.println(i);
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		//	call method here and again print i value here
		X d = new X();
		d.dispaly();
		System.out.println(d.i);
	}
}
	


