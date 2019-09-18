package day2;


public class Addition2 {
int a = 50;
int b = 60;
int c,e;
float f;

void  add()
{
	c = a+b;
	System.out.println(c);
}


void  Multiplication()
{
	e = a*b;
	System.out.println(e);
}
void  Division()
{
	f = (float)a/b;
	System.out.println(f);
}



public static void main(String args[]){
	Addition2 a = new Addition2();
	a.add();
	a.Multiplication();
	a.Division();
	
			
}
}

