package Day6;



class demoo
{
protected int i = 12;
//create method here and print i value
public void display()
{
	System.out.println(i);
}
}
public class demo11
{
public static void main(String[] args) 
	
{

//call method here and again print i value here
	demoo d = new demoo();
 	d.display();
	d.i++;
	System.out.println(d.i);
}
}


