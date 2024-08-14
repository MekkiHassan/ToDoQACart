package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginPage extends  SetProperity{
   /* @BeforeTest
    public static void setup(){
        SetProperity.openSession();
        driver.navigate().to("https://todo.qacart.com/login");

    }*/
    @Test  (priority = 1)
    public static void enterEmail(){
        WebElement emailFiled = driver.findElement(By.xpath("//input[@data-testid=\"email\"]"));
        emailFiled.sendKeys("mekko@gmail.com");
    }
    @Test  (priority = 2)
    public static void enterPassword(){
        WebElement passwordFiled = driver.findElement(By.xpath("//input[@data-testid=\"password\"]"));
        passwordFiled.sendKeys("0123456789aA*");
    }
    @Test  (priority = 3)
    public static void Submit(){
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }

}
