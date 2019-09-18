package Day14;
class Student 
{
	int Total;
	public int  Total_Marks(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		return m1+m2+m3+m4+m5+m6;
	}
	public int  Total_Marks(int m1,int m2,int m3,int m4,int m5,int m6,int m7)
	{
		return m1+m2+m3+m4+m5+m6+m7;
	}
}

public class OverloadMethod {
	public static void main(String[] args) {
		Student s = new Student();
		int T = s.Total_Marks(55, 56, 52, 42, 66, 85);
		int T1 = s.Total_Marks(55, 85, 44, 74, 44, 88, 65);
		System.out.println("Total Marks: "+T);
		System.out.println("Total Marks: "+T1);
	}
}
