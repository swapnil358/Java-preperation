package Programs.javaPrograme1;

import java.util.Arrays;

public class RightRotateAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//output= right roate by 1
		// {5,1,2,3,4}
	
		//output= right roate by 3
		//{3,4,5,1,2}
		
		
		//get last element 5
		
		
		
		int n=3;
		
		for (int j = 1; j <= n; j++) {
			
			int last = arr[arr.length-1];

		for (int i=arr.length-1; i >0; i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=last;
		
		}
		System.out.println(Arrays.toString(arr));
	}
}
