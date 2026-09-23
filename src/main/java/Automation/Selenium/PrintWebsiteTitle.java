package Automation.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebsiteTitle {

    public static void main(String[] args) {

        // Create Chrome browser instance
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Get and print website title
        String title = driver.getTitle();

        System.out.println("Website Title: " + title);

        // Close browser
        driver.quit();
    }
}