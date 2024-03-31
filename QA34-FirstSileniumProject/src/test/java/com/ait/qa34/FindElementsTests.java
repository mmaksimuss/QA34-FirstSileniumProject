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
       WebElement element=driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }
    @AfterMethod   //postcondition
    public void tearDown(){
        driver.quit();
    }
}
