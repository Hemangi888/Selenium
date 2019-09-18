package Day14;

import java.util.Arrays;

public class DublicateString {
	public static void main(String[] args) {
		String s1 = "bindi";
		String s2 = "in";
		char a[] = new char []{'b','i','n','d','i'};
		char b[] = new char []{'b','i'};
		if(s1.equals(a))
		{
			System.out.println(a);
		}
		boolean result = Arrays.equals(a, b);
		System.out.println("Both are Not  Equal "+result);
	}
}