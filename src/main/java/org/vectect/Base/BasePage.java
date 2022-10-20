package org.vectect.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        // wait = new WebDriverWait(driver, Duration.ofMillis(500), Duration.ofMillis(500));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
    }

    @BeforeSuite
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    public void waitForPageToSettle(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
