package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebpageAutomation {

    private static WebDriver driver;

    public static void main(String[] args) {
        // Initialize WebDriver (you may need to set the path to your chromedriver executable)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Example usage:
        filter("brand", "option1", "option2", "option3");
        filter("brand", "all");
        filter("mobile", "option1", "option2");
        filter("Type", "option1");

        // Close the WebDriver
        driver.quit();
    }

    //This line declares a method named filter that takes a label (String) and variable arguments (String...) for options.
    public static void filter(String label, String... options) {
        //This line locates the label element on the webpage using XPath.
        // It constructs an XPath expression to find a label element with the specified text.
        WebElement labelElement = driver.findElement(By.xpath("//label[text()='" + label + "']"));

        // Check if the "all" option is provided
        if (options.length == 1 && options[0].equalsIgnoreCase("all")) {
            //This line checks if the number of options is 1, and if that option is "all". If true,
            // it means the user wants to select all checkboxes under the specified label.

            // Select all checkboxes under the specified label
            List<WebElement> allCheckboxes = labelElement.findElements(By.xpath(".//input[@type='checkbox']"));
            for (WebElement checkbox : allCheckboxes) {
                checkbox.click();
            }

        } else {
            // Select specific options under the label
            //If the user doesn't want to select all checkboxes, it means they have provided specific options.
            for (String option : options) {
                //This line starts a loop to iterate over the provided options.
                WebElement optionCheckbox = labelElement.findElement(By.xpath(".//input[@type='checkbox' and @value='" + option + "']"));
                //Within the loop, it constructs an XPath expression to find the checkbox with the specified value (option) under the specified label.
                optionCheckbox.click();
                //It clicks on the checkbox for the current option, effectively selecting it.
            }
        }
    }
}
