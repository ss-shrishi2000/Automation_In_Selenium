package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {
    public static void main(String[] args) throws InterruptedException {
        // handling dropdowns which have the tag as select and below them they have options to choose
        // Using the Select class
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        //deselectAll(), deselectByIndex(), deselectByValue(), selectAll(), selectByIndex(), selectByValue(), methods in Selenium
        //getAllSelectedOptions(), getFirstSelectedOption, getOptions, isMultiple() methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
        WebElement dropdown = driver.findElement(By.id("how-select"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("Podcast");
        Thread.sleep(2000);
        select.selectByVisibleText("YouTube");
        driver.close();
    }
}
