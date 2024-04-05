package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTest() {
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        click(By.cssSelector("[href='/register']"));
        type(By.name("FirstName"), "Petr");
        type(By.name("LastName"), "Petrov");
        type(By.name("Email"), "mak28" + i + "@gm.com");
        type(By.name("Password"), "1234567890");
        type(By.name("ConfirmPassword"), "1234567890");
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/customer/info']")));
    }

}
