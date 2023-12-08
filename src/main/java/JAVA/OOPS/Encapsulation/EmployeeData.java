package JAVA.OOPS.Encapsulation;

public class EmployeeData { // The process of binding data and coding part is called as "Encapsulation"

    // also called Data-hiding

    //Defination --
//	==================
    /**
     * Encapsulation is the bundling of data and methods that
     * operate on the data into a single unit, often a class, and restricting access to the internal details of the object.
     */


    // how to implement Encapsulation:
    //=======================================
    //
    // 1. private data variable: so that variable can not be accessed directly from
    // outside the class

    /*
     * Real-time Example Encapsulation: School bag is one of the most real examples
     * of Encapsulation. School bag can keep our books, pens, etc
     *
     * https://www.scientecheasy.com/2018/06/encapsulation-in-java-real-time-
     * examples-advantages.html
     */

    /*
     * Q)What is the difference between Encapsulation and Abstraction? Ans: The
     * process of binding data and coding part is called as "Encapsulation". The
     * process showing necessary data or implementation and hiding unnecessary
     * data or implementation is called as "Abstraction".
     *
     */

    /*
     * Encapsulation have a lot of meaning over the internet. Most of them are
     * irrelevant.
     *
     * What we could achieve with the getters and setters can be directly achieved
     * with the help of public variable.
     *
     * Then why people use getters and setters. With a method, we can control the
     * data getting set and data that is returned, Which is not possible with public
     * variables.
     *
     * For example, let us assume a method called getUserName where i can return a
     * default username of admin when the username is null. But that sort of
     * abstraction is not possible with variable.
     *
     * You cannot have the control.
     *
     * So to your question, encapsulation doesn't hide data but the implementation.
     * It provides an abstraction layer to cater business logic.
     *
     */
    private int ssn;
    private String name;
    private int empAge;

    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();
        emp.setName("TOM");
        emp.setSsn(54566);
        emp.setEmpAge(25);

        System.out.println("EMployee name is: " + emp.getName());
        System.out.println("EMployee age is :+" + emp.getEmpAge());
        System.out.println("EMployee age is :" + emp.getSsn());
    }

    // 1. private data variable: so that variable can not be accessed directly from
    // outside the class
    // 2. public getter and setter methods: to get and Set the values of the fields

    public int getSsn() {

        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}
