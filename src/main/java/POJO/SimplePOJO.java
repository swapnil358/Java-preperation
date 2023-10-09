package POJO;

/*
{
    "firstName": "John",
    "lastName": "Doe",
    "age": 30,
    "email": "johndoe@example.com"
}

 */

public class SimplePOJO {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    //Default constructor for Deserialization
    public SimplePOJO(){
    }

    public SimplePOJO(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
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
        if (age>18) { //checking condition
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SimplePOJO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

class testPojo{
    public static void main(String[] args) {
        SimplePOJO pojo = new SimplePOJO();
        pojo.setFirstName("Swapnil");
        pojo.setLastName("bodade");
        pojo.setAge(19);
        pojo.setEmail("swap@gmail.com");

        System.out.println(pojo.getFirstName());
        System.out.println(pojo.getLastName());
        System.out.println(pojo.getAge());
        System.out.println(pojo.getEmail());
    }
}
