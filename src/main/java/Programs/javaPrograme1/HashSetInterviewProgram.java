package Programs.javaPrograme1;

import java.util.HashSet;

/* 
 *Interview Question
 * 
 *	Set 1 = {2,5,8,6,8};
	Set 2 = {2,8,4,9}
	Answer should be {2,8}.
 */

public class HashSetInterviewProgram {

	public static void main(String[] args) {

		HashSet s1 = new HashSet();
		s1.add(2);
		s1.add(5);
		s1.add(8);
		s1.add(6);
		s1.add(8);

		HashSet s2 = new HashSet();
		s2.add(2);
		s2.add(8);
		s2.add(4);
		s2.add(9);

		s1.retainAll(s2);

		System.out.println(s1);

	}

}
