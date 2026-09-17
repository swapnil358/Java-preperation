package JAVA.OOPS.ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StalementExceptionHandling {
    public static void main(String[] args) {


        /*
         * ============================================================
         * STALE ELEMENT REFERENCE EXCEPTION
         * ============================================================
         *
         * Question:
         * What is StaleElementReferenceException?
         *
         * Answer:
         * It occurs when Selenium has located an element, but the DOM
         * changes and the previously located WebElement becomes invalid.
         *
         * Example scenario:
         * A button is located, then the page refreshes or JavaScript
         * recreates the button. The old WebElement reference may become
         * stale.
         *
         * ============================================================
         * APPROACH 1: STORING WebElement
         * ============================================================
         */
        WebDriver driver = new ChromeDriver();
        WebElement button = driver.findElement(By.id("submit"));
        button.click();


        /*
         * ============================================================
         * APPROACH 2: STORING By LOCATOR
         * ============================================================
         *
         * Instead of storing the WebElement, store the locator and
         * locate the element when required.
         */

        By submitButton = By.id("submit");
        driver.findElement(submitButton).click();


        /*
         * ============================================================
         * IMPORTANT INTERVIEW POINT
         * ============================================================
         *
         * By itself does NOT handle StaleElementReferenceException.
         *
         * The advantage of using By is that the element can be
         * re-located after the DOM changes.
         *
         * Explicit wait/retry logic can also be used when required.
         */

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(submitButton))
                .click();


        /*
         * ============================================================
         * INTERVIEW ANSWER
         * ============================================================
         *
         * StaleElementReferenceException occurs when the DOM changes
         * after Selenium has located an element, making the existing
         * WebElement reference invalid.
         *
         * We can reduce this problem by storing By locators and
         * locating the element again when required.
         *
         * We can also use explicit waits and retry logic for dynamic
         * elements.
         *
         * ============================================================
         */
    }
}