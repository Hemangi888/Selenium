package Day14;
class Employee
{
	int basicpay;
	public void  Basic_Pay(int payperday,int days)
	{
		basicpay = days * payperday ;
		System.out.println("Employee Basic Pay");
	}
	
}
class Department extends Employee
{
	public void Basic_Pay(int payperday,int days)
	{
		basicpay = days * payperday ;
		System.out.println("Department Basic Pay");
	}
}

public class EmpDept {
	public static void main(String[] args) {
		Employee e = new Department ();
		e.Basic_Pay(2000, 31);
		System.out.println("Basic Pay : "+e.basicpay);

}
}