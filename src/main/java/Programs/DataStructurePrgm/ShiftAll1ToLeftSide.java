package Programs.DataStructurePrgm;

import java.util.Arrays;

public class ShiftAll1ToLeftSide {

	public static void main(String[] args) {

		int a[] = { 1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };
		method1(a);

		int arr[] = { 1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };
		method2(arr);

		    System.out.println("Modified array: ");
		    for (int num : a) {
		        System.out.print(num + " ");
		    }
		    
		
			int array[] = { 1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };
			System.out.println("Using method 3" );
			method3(array);
		


	}
	
	public static void method3(int[] array) {
        //This is correct solution
		
		//int array[] = { 1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };
		
		
        // Count the number of 1's in the array
		   int leftPointer = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == 1) {
	                // Swap 1 with the element at leftPointer
	                int temp = array[i];
	                array[i] = array[leftPointer];
	                array[leftPointer] = temp;

	                leftPointer++;
	            }
	        }

	        // Print the modified array
	        System.out.print("Modified Array: ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }



	private static void method1(int[] a) {
	//	int a[] = { 1, 2, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };

		// System.out.println(Arrays.toString(a));

		int i = 0;
		int j = a.length - 1;
		int temp = 0;
		while (i <= j) {
			if (a[i] != a[j]) {
				if (a[i] == 1) {
					i++;
				}
				if (a[j] == 1) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j--;
			} else {
				break;
			}
			System.out.println(Arrays.toString(a));
		}

		 System.out.println("*************Final output : " + Arrays.toString(a));
	}

	
	public static void method2(int[] arr) {
	
		//{ 1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3 };
		    int left = 0;
		    int right = arr.length - 1;

		    while (left < right) {
		        if (arr[right] == 1 && arr[left] !=1) {
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            
		            if (arr[left] == 1) {
		                left++;
		            }
		        }

		        right--;
		    }
		    
		}
	

		
}
