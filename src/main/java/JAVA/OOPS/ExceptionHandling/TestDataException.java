package JAVA.OOPS.ExceptionHandling;
/*
Q25. What is a custom exception?
A custom exception is an application/framework-specific exception class that gives failures a meaningful domain name

 allow the framework to communicate meaningful failure categories such as ConfigurationException,
DriverInitializationException, TestDataException or ApiClientException instead of exposing low-level implementation
details everywhere
*/

public class TestDataException extends RuntimeException {

    private  TestDataException(String message){
        super(message);
    }

    public TestDataException(String message, Throwable cause) {

        //preserve original clause
        super(message, cause);
    }

}
