package com.devco.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChrome {
    private static WebDriver driver;

    public static DriverChrome web() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
        driver = new ChromeDriver(options);
        return new DriverChrome();
    }

    public  WebDriver inTheWebPage(String url) {
        driver.get(url);
        return  driver;
    }

}

