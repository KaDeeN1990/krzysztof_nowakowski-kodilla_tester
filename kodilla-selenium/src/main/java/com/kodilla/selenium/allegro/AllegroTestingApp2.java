package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class AllegroTestingApp2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement accept = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div/div/div/div[2]/div[2]/button[1]"));
        accept.click();
        Thread.sleep(1000);
        WebElement changeCategory = driver.findElement(By.cssSelector(".mp7g_oh > select"));
        Select categorySelect = new Select(changeCategory);
        categorySelect.selectByIndex(3);
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.cssSelector(".mpof_ki > input"));
        search.sendKeys("Mavic mini");
        search.submit();
        Thread.sleep(1000);
        List<WebElement> element = driver.findElements(By.cssSelector("section > article"));
        element.get(0).getText();
        element.get(1).getText();
    }
}
