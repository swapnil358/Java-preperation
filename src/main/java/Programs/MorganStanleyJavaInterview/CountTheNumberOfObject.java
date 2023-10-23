package Programs.MorganStanleyJavaInterview;

//Write a java programme to count the number of object
public class CountTheNumberOfObject {

    // Static variable to count the number of objects created
    private static int objectCount = 0;

    public CountTheNumberOfObject() {
        // Increment the objectCount variable each time an object is created
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating three objects of the test class
        CountTheNumberOfObject obj1 = new CountTheNumberOfObject();
        CountTheNumberOfObject obj2 = new CountTheNumberOfObject();
        CountTheNumberOfObject obj3 = new CountTheNumberOfObject();
        CountTheNumberOfObject obj4 = new CountTheNumberOfObject();

        // Get the number of objects created
        int count = CountTheNumberOfObject.getObjectCount();

        System.out.println("Number of objects created: " + count);
    }
}
