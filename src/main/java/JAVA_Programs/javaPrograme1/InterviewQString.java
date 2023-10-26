package JAVA_Programs.javaPrograme1;

public class InterviewQString {

    public static void main(String[] args) {
        String s = "apple";
        s = "mango";
        System.out.println(s);

        /*
        You are correct that `String` objects in Java are immutable,
        which means their values cannot be changed once they are assigned. However,
        the code you provided does not change the value of the original `String` object "apple." Instead,
        it creates a new `String` object with the value "mango" and assigns it to the variable `s`.
        Let me explain the code step by step:

1. `String s = "apple";`: This line creates a `String` object with the value "apple" and
                assigns it to the variable `s`.

2. `s = "mango";`: This line does not modify the original "apple" `String`.
                   Instead, it creates a new `String` object with the value "mango" and
                   assigns it to the variable `s`.
                   This reassignment makes `s` reference the new `String` object with the value "mango,"
                   while the "apple" `String` object still exists in memory but is no longer referenced by `s`.

3. `System.out.println(s);`: This line prints the value of the variable `s`,
                    which is now "mango" because of the reassignment in the previous step.

So, the output of the code is "mango" because you have effectively replaced the original "apple" `String` with a new `String` containing "mango" by reassigning the variable `s`.
         */


    }
}
