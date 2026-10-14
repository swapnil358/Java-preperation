package Automation.Selenium.SeleniumTestNGFrameworkComprehensive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrameworkComprehensive {

    public static void main(String[] args) {
        //framework Selenium
        System.out.println("Open the below link for framework");

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/swapnil358/Selenium-TestNG-Framework-Comprehensive");

        System.out.println("Here is the framework to prepare for interview");
    }
}
