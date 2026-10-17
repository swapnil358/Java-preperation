package _interviewResources.DesignPattern;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AutomationStreamExamples {

    static class TestResult {
        String testName;
        String status;
        String browser;

        TestResult(String testName, String status, String browser) {
            this.testName = testName;
            this.status = status;
            this.browser = browser;
        }
    }

    public static void main(String[] args) {

        List<TestResult> results = Arrays.asList(
                new TestResult("LoginTest", "PASS", "Chrome"),
                new TestResult("PaymentTest", "FAIL", "Chrome"),
                new TestResult("SearchTest", "PASS", "Firefox"),
                new TestResult("CheckoutTest", "FAIL", "Edge"),
                new TestResult("ProfileTest", "PASS", "Chrome")
        );

        // QUESTION 1: Find failed test names
        List<String> failedTests = results.stream()
                .filter(t -> t.status.equals("FAIL"))
                .map(t -> t.testName)
                .collect(Collectors.toList());

        System.out.println("Failed tests: " + failedTests);

        // QUESTION 2: Count passed tests
        long passedCount = results.stream()
                .filter(t -> t.status.equals("PASS"))
                .count();

        System.out.println("Passed tests: " + passedCount);

        // QUESTION 3: Find unique browsers
        List<String> browsers = results.stream()
                .map(t -> t.browser)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique browsers: " + browsers);

        // QUESTION 4: Find failed tests on Chrome
        List<String> chromeFailures = results.stream()
                .filter(t -> t.status.equals("FAIL"))
                .filter(t -> t.browser.equals("Chrome"))
                .map(t -> t.testName)
                .collect(Collectors.toList());

        System.out.println("Chrome failures: " + chromeFailures);

        // QUESTION 5: Get all test names in uppercase
        List<String> testNames = results.stream()
                .map(t -> t.testName.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Test names: " + testNames);

        // QUESTION 6: Count failed tests
        long failedCount = results.stream()
                .filter(t -> t.status.equals("FAIL"))
                .count();

        System.out.println("Failed count: " + failedCount);

        // QUESTION 7: Sort test names alphabetically
        List<String> sortedTests = results.stream()
                .map(t -> t.testName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted tests: " + sortedTests);

        // QUESTION 8: Find the first failed test
        String firstFailedTest = results.stream()
                .filter(t -> t.status.equals("FAIL"))
                .map(t -> t.testName)
                .findFirst()
                .orElse("No failed tests");

        System.out.println("First failed test: " + firstFailedTest);

        // QUESTION 9: Check whether any test failed
        boolean hasFailures = results.stream()
                .anyMatch(t -> t.status.equals("FAIL"));

        System.out.println("Has failures: " + hasFailures);

        // QUESTION 10: Get passed test names, sorted alphabetically
        List<String> passedTests = results.stream()
                .filter(t -> t.status.equals("PASS"))
                .map(t -> t.testName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Passed tests: " + passedTests);
    }
}

