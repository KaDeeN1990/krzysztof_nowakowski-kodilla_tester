package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("c:\\Selenium-drivers\\results"))
                .snapshotPath(Paths.get("c:\\Selenium-drivers\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);
        page.open();
        page.compare();
        page.close();
    }
}
