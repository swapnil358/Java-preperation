package JAVA.OOPS.ListConcept;

//Refer video - https://youtu.be/UesFP2vXih0?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); //0
		ar.add("200"); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		System.out.println("arrayList ar:" +ar);
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		ar.add("TOM"); //5
		ar.add("ABC"); //6
		ar.add(12.3); //7
		ar.add("A"); //8
		
		ar.add(55);//9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));
		
		//IndexOutOfBoundsException
		//System.out.println(ar.get(9));
	
	//TO print all the values of array : FOR loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		//To add only integer in ArrayList
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(123);
		//ar1.add("abcd"); ---> error for string
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("TOM");
		//ar2.add(223); ----> error for String
		
		
		
	}

}
