package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    WebDriver driver;


    @BeforeMethod  //precondition
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();//max window of browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait for all elements on the site to load before starting browser
    }

    @Test
    public void findElementByTegName() {
        //find element by Tag name
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }

    @Test
    public void findElementByLocators() {
        // id
        driver.findElement(By.id("city"));
        // class name
        driver.findElement(By.className("input-container"));
        // name
        //driver.findElement(By.name("name"));
        // link text
        driver.findElement(By.linkText("Let the car work"));
        //partial link text
        driver.findElement(By.partialLinkText("work"));

    }

    //css selector
    @Test
    public void findElementByCssSelector() {
        // tag Name=tag Name
        // id->#
        // findElement (By.id(#city))
        driver.findElement(By.cssSelector("#city"));
        // class name -> .className
        // driver.findElement(By.className(".input-container"));
        driver.findElement(By.cssSelector(".input-container"));
        //[name='user']
        driver.findElement(By.cssSelector("[for='city']"));
        driver.findElement(By.cssSelector("[href='/search']"));
        // contains -> *
        driver.findElement(By.cssSelector("[href*='car']"));
        // start -> ^
        driver.findElement(By.cssSelector("[href^='/let']"));
        // end on ->$
        driver.findElement(By.cssSelector("[href$='work']"));

    }

    // xPath   // tag[@atrib="value"]
    @Test
    public void findElementByXpath() {
        // tag name = //tag
        // driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//h1"));
        // id -> //tag[@id='idName']
        // driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='city']"));
        //class name -> //tag[@class='className']
        // driver.findElement(By.className("input-container"));
        driver.findElement(By.xpath("//*[@class='input-container']"));
        //contains -> //*[contains(@attr,'...')]
        // driver.findElement(By.cssSelector("[href*='car']"));
        driver.findElement(By.xpath("//*[contains(@href,'car')]"));
        // start -> //*
        //driver.findElement(By.cssSelector("[href^='/let']"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/let')]"));

        // text
        driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[contains(.,'mistake')]"));
        driver.findElement(By.xpath("//span[contains(text(),'mistake')]"));

       // search of parent element - //input[@id='username']/..
       // //div/a - child - css = div>a
       // //div//a - any level child - css = div a



    }

    @AfterMethod   //postcondition
    public void tearDown() {
        driver.quit();
    }
}
