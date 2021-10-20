package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
    WebElement cookies = driver.findElement(By.xpath("//button[2]"));
    cookies.click();
    Thread.sleep(1000);
    WebElement reg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
    reg.click();
    Thread.sleep(1000);
    WebElement name = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
    name.sendKeys("Krzysztof");
    Thread.sleep(1000);
    WebElement surname = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
    surname.getAttribute("Nowakowski");
    Thread.sleep(1000);
    WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
    Select yearSelect = new Select(yearCombo);
    yearSelect.selectByIndex(5);
}
}
