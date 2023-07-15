package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        // the file shall contain code for selecting multiple elements from the dropdown / Multi-Select Dropdown
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.mobiscroll.com/select/multiple-select");
        driver.manage().window().maximize();
        /*
        WebElement multiSelectInput = driver.findElement(By.id("multiple-select"));
        Select select = new Select(multiSelectInput);
        select.selectByValue("1");
        select.selectByValue("2");
        select.selectByValue("3");
        select.selectByValue("4");
        select.selectByValue("5");
        select.selectByValue("6");
        select.selectByValue("7");
        select.selectByValue("8");
        List<WebElement> lst = select.getAllSelectedOptions();
        System.out.println(lst);
        for(int i = 0; i < lst.size(); i++){
            select.deselectByIndex(i);
        }
        */
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        //identify dropdown
        WebElement d = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
        Select s=new Select(d);
        //get options of dropdown in list
        List lst =s.getOptions();
        System.out.println("Options are: ");
        for(int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }
        Boolean b=s.isMultiple();
        System.out.println("Is the Dropdown Multi-Select? : "+ b);
        s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByVisibleText("Wait Commands");
        Thread.sleep(1000);
        //get first selected option in dropdown
        WebElement f = s.getFirstSelectedOption();
        System.out.println("First selected option is: "+ f.getText());
    }
}
