package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingAutoSuggestiveDropdown {
    public static void main(String[] args) {
        // As soon as the user types in the input in the search box; the suggestions start to appear in the form of a dropdown
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//button[@aria-label=\'Dismiss sign-in info.\']//span[@class=\'b6dc9a9e69 e25355d3ee\']//*[name()=\'svg\']")).click();
        WebElement searchBar = driver.findElement(By.xpath("//input[@id=':Ra9:']"));
        searchBar.sendKeys("Dubai");
        // selecting the first option visible in the lis of options in the Autosuggestions dropdown
        searchBar.sendKeys(Keys.ARROW_DOWN);
        // finding the search bar and performing the Arrow down operation to select the first element from the dropdown
        searchBar.sendKeys(Keys.ENTER);
        // Hit enter for selecting the first element from the dropdown
        driver.quit();
    }
}
