package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement accept = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div/div/div/div[2]/div[2]/button[1]"));
        accept.click();
        Thread.sleep(1000);
        WebElement changeCategory = driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div/div/div[1]/div/form/div[3]/div/select"));
        Select categorySelect = new Select(changeCategory);
        categorySelect = new Select(changeCategory);
        categorySelect.selectByIndex(3);
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div/div/div[1]/div/form/input"));
        search.sendKeys("Mavic mini");
        search.submit();
    }
}
