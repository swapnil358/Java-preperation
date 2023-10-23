package JAVA_OOPS.POJO;

/*
{
    "firstName": "John",
    "lastName": "Doe",
    "age": 30,
    "email": "johndoe@example.com",
    "hobbies": ["Reading", "Hiking", "Cooking"]
}

 */

import java.util.ArrayList;
import java.util.List;

public class POJO2 {

    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobbies;

    public POJO2() {
    }

    public POJO2(String firstName, String lastName, int age, String hobby) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        //this.hobbies=hobbies;

        if (!"Reading".equalsIgnoreCase(hobby)) {
            this.hobbies = new ArrayList<>();
            this.hobbies.add(hobby);
        }
    }





    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "POJO2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}

class testPojo2{
    public static void main(String[] args) {
        POJO2 p = new POJO2();

        List<String> list = new ArrayList<>();
        list.add("Reading");
        list.add("Dancing");
        list.add("Singing");

        p.setFirstName("swapnil");
        p.setLastName("bodade");
        p.setAge(17);
        p.setHobbies(list);



        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
//        System.out.println(p.getHobbies());
        List<String> hobbies = p.getHobbies();
        hobbies.forEach(s-> System.out.println("- "+s));
    }
}
