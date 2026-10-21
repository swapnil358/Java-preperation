package JAVA.Programs.javaPrograme1;

//  1. How does insertion order work in a LinkedList?
/*
* Java's LinkedList is implemented as a doubly linked list. Each node maintains references to the previous and next nodes. Elements are traversed in their linked sequence, so the list preserves insertion order. We can add elements at the beginning, end, or a specified index.
*
*
*
* */

import java.util.LinkedList;

public class LinkedListWorking {

    public static void main(String[] args) {

            LinkedList<String> names = new LinkedList<String>();

            names.add("Amit");
            names.add("Rahul");
            names.add("Priya");

            System.out.println(names);

            names.addFirst("Swapnil");
            names.addLast("Nikhil");

        System.out.println(names);
    }
}
