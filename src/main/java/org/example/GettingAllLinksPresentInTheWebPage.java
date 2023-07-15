package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GettingAllLinksPresentInTheWebPage {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        List<WebElement> lst = driver.findElements(By.tagName("a"));
        for(int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText());
        }
        // similar logic for printing all the elements of a web driver
        driver.navigate().to("https://www.salesforce.com/au/form/signup/freetrial-elf-v2/");
        WebElement dropdown = driver.findElement(By.id("UserTitle-Yngy"));
        Select select = new Select(dropdown);
        List<WebElement> lstDropdown = select.getOptions();
        for(int i = 0; i < lstDropdown.size(); i++){
            System.out.println(lstDropdown.get(i));
        }
        driver.quit();
    }
}
