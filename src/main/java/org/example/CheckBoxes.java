package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/resources/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        WebElement resourceTypeBox = driver.findElement(By.xpath("//div[@class=\"filter\"]//button[@aria-owns=\"bs-select-1\"]"));
        resourceTypeBox.click();
        WebElement lstElement = driver.findElement(By.xpath("//div[@id=\"bs-select-1\"]//ul"));
        List<WebElement> elements = lstElement.findElements(By.tagName("li"));
        for(int i = 0; i < elements.size(); i++){
            System.out.println(elements.get(i).getText());
        }
        driver.close();
    }
}
