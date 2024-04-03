package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementBy {
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

    @Test
    public void findElementByCssSelector() {

        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#mob-menu-button "));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector(".master-wrapper-page .header"));
        driver.findElement(By.cssSelector("[type='text/javascript']"));
        driver.findElement(By.cssSelector("[href='/electronics']"));
        driver.findElement(By.cssSelector("[style*=none]"));
        driver.findElement(By.cssSelector("[src^=https]"));
        driver.findElement(By.cssSelector("[src$=jpeg]"));
        driver.findElement(By.cssSelector("[src*=own]"));

    }

    @Test
    public void findElementByXPath() {
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@id='mob-menu-button']"));
        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//*[contains(@class, 'master-wrapper-page')]//*[contains(@class, 'header')]"));
        driver.findElement(By.xpath("//*[@type='text/javascript']"));
        driver.findElement(By.xpath("//*[contains(@href,'/electronics')]"));
        driver.findElement(By.xpath("//*[contains(@style,'none')]"));
        driver.findElement(By.xpath("//img[starts-with(@src, 'https')]"));
        driver.findElement(By.xpath("//img[contains(@src, '.jpeg')]"));
        driver.findElement(By.xpath("//img[contains(@src, 'own')]"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
