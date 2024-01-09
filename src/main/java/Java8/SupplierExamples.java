package Java8;

import java.util.function.Supplier;

public class SupplierExamples {
    public static void main(String[] args) {

//        getGreetings();



        // Example: Conditional Value Generation
        Supplier<String> greetingSupplier = getStringSupplier();
        
        String greeting = getGreeting(greetingSupplier);

        System.out.println(greeting);
    }

    private static Supplier<String> getStringSupplier() {
        Supplier<String> greetingSupplier = () -> {
            String s = isMorning() ? "Good morning!" : "Hello!";
            return s;
        };
        return greetingSupplier;
    }

    private static String getGreeting(Supplier<String> greetingSupplier) {
        String greeting = greetingSupplier.get();
        return greeting;
    }

    private static boolean isMorning() {
        return System.currentTimeMillis() < 12 * 60 * 60 * 1000; // 12 hours in milliseconds
    }
}
