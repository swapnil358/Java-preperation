package JAVA_Programs.javaPrograme1;

public class GetNumberFromString {

    public static void main(String[] args) {


        String str = "2019\ncurrent";

        String numberOnly = str.replaceAll("[^0-9]", "");

        int i = Integer.parseInt(numberOnly);

        System.out.println(i);

        method1();

        method3();
    }


    public static void method1() {
        String str = "20191225-0001";

        String replaceAll = str.replaceAll("^[a-zA-Z-]+[.,?\\d]*$", "");
        System.out.println("Method 2: " + replaceAll);

    }

    public static void method3() {
        String str = "swap@123-bodade%&";

        String replaceAll = str.replaceAll("^[a-zA-Z-]+[.,?\\d]*$", "");
        System.out.println("Method 3: " + replaceAll);
//^[a-zA-Z-]+[.,?\d]*$
    }

}
