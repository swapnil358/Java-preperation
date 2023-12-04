package JAVA.OOPS.AbstractionConcept;

public abstract class ConstructorInAbstractClass {
    /**
     * The primary purpose of a constructor in an abstract class is to initialize the common state shared by all subclasses.
     * While you cannot create an object directly from an abstract class,
     * constructors in abstract classes are invoked when an object of a concrete subclass is created.
     */
    private String name;

    // Constructor in the abstract class
    public ConstructorInAbstractClass(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    abstract void makeSound();

    // Concrete method in the abstract class
    public String getName() {
        return name;
    }

    static class Dog extends ConstructorInAbstractClass {
        private String breed;

        // Constructor in the concrete subclass
        public Dog(String name, String breed) {
            super(name); // Invoke the constructor of the abstract class
            this.breed = breed;
        }

        // Implementation of the abstract method
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }

        // Additional method in the concrete subclass
        public String getBreed() {
            return breed;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog("Buddy", "Golden Retriever");
            System.out.println(myDog.getName()); // Accessing method from the abstract class
            System.out.println(myDog.getBreed()); // Accessing method from the concrete subclass
            myDog.makeSound(); // Accessing abstract method
        }
    }
}
