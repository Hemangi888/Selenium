package Day14;
abstract class A
{
	abstract void run();
}
class car  extends A
{
	void run()
	{
		System.out.println("Car is Running");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		A a = new car();
		a.run();
	}
}
