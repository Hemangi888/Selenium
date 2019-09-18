package Day9;

public class DuplicateValue {
	public static void main(String[] args) {
		int arr[]= {5,2,2,5,7,4};
		int i,j;
		for(i=0;i<=arr.length;i++)
			for(j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
				
					System.out.println(arr[i]);
	
		
	//	System.out.println(charAt(arr.length));
		
	}
}
