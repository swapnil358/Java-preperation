package JAVA.Programs.javaPrograme1;

import java.util.ArrayList;
import java.util.Iterator;



//Using Iterator

//We can print ODD and Even numbers from the list

public class EvenNumberUsingCursors {

	public static void main(String[] args) {

		ArrayList<Integer> ls = new ArrayList();

		for (int i = 0; i <= 10; i++) {

			ls.add(i);
			
			//System.out.println(ls.add(i));
		}
		System.out.println("Added : "+ls);

		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();

			if (n % 2 == 0) {
				System.out.println(n);
			}

		}

		
		
	}

}
