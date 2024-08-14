package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestAddTasks extends SetProperity{
/*    @BeforeTest
    public static void opensession(){

        SetProperity.openSession();
        //make login process
        WebElement emailFiled = driver.findElement(By.xpath("//input[@data-testid=\"email\"]"));
        emailFiled.sendKeys("mekkoha@gmail.com");
        WebElement passwordFiled = driver.findElement(By.xpath("//input[@data-testid=\"password\"]"));
        passwordFiled.sendKeys("0123456789aA*");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }*/
    @Test (priority = 1)
    public static  void AddFirstTask() throws InterruptedException {
        //Add Task process
        WebElement addbutton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']"));
        addbutton.click();

        WebElement item_filed = driver.findElement(By.xpath("//input[@data-testid=\"new-todo\"]"));
        item_filed.sendKeys("Wakeup");

        driver.findElement(By.xpath("//span[text()=\"Create Todo\"]")).click();
        Thread.sleep(2000);
    }
    @Test (priority = 2)
    public static  void AddSecondTask() throws InterruptedException{
        WebElement addbutton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']"));
        addbutton.click();

        WebElement item_filed = driver.findElement(By.xpath("//input[@data-testid=\"new-todo\"]"));
        item_filed.sendKeys("Make a breakfast");

        driver.findElement(By.xpath("//span[text()=\"Create Todo\"]")).click();
        Thread.sleep(2000);
    }
    @Test (priority = 3)
    public static  void AddThirdTask()throws InterruptedException{
        WebElement addbutton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']"));
        addbutton.click();

        WebElement item_filed = driver.findElement(By.xpath("//input[@data-testid=\"new-todo\"]"));
        item_filed.sendKeys("Make a coffee");

        driver.findElement(By.xpath("//span[text()=\"Create Todo\"]")).click();
        Thread.sleep(2000);
    }


}
