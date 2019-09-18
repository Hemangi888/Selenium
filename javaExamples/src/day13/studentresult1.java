package day13;

class student
{
		//float per;
		int Total;
	    void Total_Marks(int m1,int m2,int m3)
		{
			Total = m1+m2+m3;
			System.out.println(" Total Marks : "+Total);
			
		}
}
class marks  extends student
{
	float per;
	float percentage()
	{
		per =(float)(Total*100)/300;
	//	System.out.println("Total percantage "+per);
		return per;
	}
}
 public class studentresult1
 {
	public static void main(String[] args) 
	{
	//	marks m = new marks();
		marks m = new marks();
		m.Total_Marks(56,85,68);
		float f = m.percentage();
		System.out.println(" percentage  :"+f);
	}

}
