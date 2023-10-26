package JAVA.OOPS.CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {

		Enumeration();
		itertor();
	}

	public static void Enumeration() {
		Vector v = new Vector();

		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if ((i % 2) == 0) {
				System.out.println(i);
			}
		}
		System.out.println(v);
	}

	public static void itertor() {

		ArrayList al = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			al.add(i);

		}
		System.out.println(al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
