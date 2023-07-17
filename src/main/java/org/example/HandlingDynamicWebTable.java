package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class HandlingDynamicWebTable {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.coinbase.com/explore");
        driver.manage().window().maximize();
        List<WebElement> webTableRows = driver.findElements(By.xpath("//tr[@class='cds-tableRow-t45thuk cds-tableRowHover-t9ma3wv']"));
        List<WebElement> webTableCols = driver.findElements(By.xpath("//td[@class='cds-tableCell-t1jg7jzg']"));
        System.out.println("No. of rows: " + webTableRows.size());
        System.out.println("No. of cols: " + webTableCols.size());
        for(int i = 1; i <= webTableRows.size(); i++){
            for(int j = 1; j < webTableCols.size(); j++){
                System.out.print(webTableCols.get(j).getText() + "  ");
            }
            System.out.println("");
        }
        driver.quit();
    }
}
