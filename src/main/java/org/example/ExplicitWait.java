package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ExplicitWait {
    private WebDriver driver;
    private String baseURL;
    private WebElement element;
    public void setup() throws Exception{
        driver = new ChromeDriver();
        baseURL = "www.saucedemo.com";
        driver.manage().window().maximize();
    }
    public void testFile() throws Exception{
        driver.get(baseURL);
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> lst = driver.findElements(By.id("inventory_item"));
        System.out.println(lst);
        driver.close();
    }
}
