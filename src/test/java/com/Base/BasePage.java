package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BasePage {
    public static WebDriver webdriver;
    public static WebDriverWait wait;
    protected static final String URL = "http://opencart.abstracta.us/index.php?route=common/home"; //Aca va URL
    public BasePage(){
        if (webdriver == null) {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
            webdriver = new ChromeDriver();
            webdriver.manage().window().maximize();
            wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
        }
    }
    public void openApp(){
        webdriver.get(URL);
    }
    public WebDriver getDriver(){
        return webdriver;
    }
    public WebElement getWebElement(By locator){
        WebElement element = null;
        try {
            element =webdriver.findElement(locator);
            openApp();
        }
        catch (Exception e){
            System.out.println("no existe el elemento:" + locator);
            System.out.println("Exception message" + e);
        }
        return  element;
    }
}
