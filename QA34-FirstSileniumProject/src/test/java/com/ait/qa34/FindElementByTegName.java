package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementByTegName {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTegName() {
        WebElement element = driver.findElement(By.tagName("div"));
        System.out.println(element);
        WebElement element1 = driver.findElement(By.tagName("ul"));
        System.out.println(element1);
        WebElement element2 = driver.findElement(By.tagName("a"));
        System.out.println(element2);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
