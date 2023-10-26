package JAVA.Programs.javaPrograme1;

//a java program to Insert a String into Another String at given index.

/**
 * input: MakeEasy
 * output: MakeSeleniumEasy
 */
public class Insert_String_into_Another_String {

    public static void main(String[] args) {
        method2();
    }


    public static void method2() {

        String s1 = "MakeEasy";
        String s2 = "Selenium";
        int indexToInsert = 4;

        System.out.println("String s1 before inserting s2 at index " + indexToInsert + ": " + s1);

        /*
         * Its simple dividing and concatenation of string. We will divide s1 in to two parts.
         * First part will be from starting index till just before index to start. Since substring() method
         * excludes last index so no need to do minus 1. Second part will be from index to start till last.
         * Add s2 in between.
         */
        s1 = s1.substring(0, indexToInsert) + s2 + s1.substring(indexToInsert);

        System.out.println("String s1 after inserting s2 at index " + indexToInsert + ": " + s1);

    }


}


