package com.kodilla.selenium.google.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayOpen {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("laptop");
        inputField.submit();
    }
}
