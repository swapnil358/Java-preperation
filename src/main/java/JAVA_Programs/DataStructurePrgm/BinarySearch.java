package JAVA_Programs.DataStructurePrgm;

//Write a programe for Binary search

//https://youtu.be/7iE5xNOJET0

public class BinarySearch {
	//Best time complexity- 0(1)
	//Worst time complexisity- O(log n)


	public static void BiSearch() {

		int[] a = { 1, 4, 8, 9, 12, 22, 34, 54, 78, 89 };

		int li = 0;
		
		int hi = a.length-1;
		
		int mi = li+hi/2;
		
		int srch = 78;
		
		while(li<=hi) {
			if(a[mi] ==srch) {
				System.out.println("element found at " + mi + " position");
			break;
			}
			else if(a[mi]<srch) {
				li = mi+1;
			}
			else if(a[mi]>srch) {
				hi= mi-1;
			}
			mi=(li+hi)/2;
		}
		
		if(li>hi) {
			System.out.println("Element not found");
		}
	   
		
		
		
	}

	public static void main(String[] args) {

		BiSearch();
	}
}
