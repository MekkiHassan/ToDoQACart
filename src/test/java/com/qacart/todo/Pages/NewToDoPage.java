package com.qacart.todo.Pages;

import com.qacart.todo.PropertiesUtil.ConfigUtil;
import com.qacart.todo.base.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NewToDoPage extends BasePages {

    public NewToDoPage(WebDriver driver) {

        super(driver);
         }
    public  void load() throws IOException {
        driver.get(ConfigUtil.getInstance().getUrlPro()+"/todo");

    }
    public void laod () throws IOException {
        driver.get(ConfigUtil.getInstance().getUrlPro()+"todo/new");
    }
    public ToDoPage addNewTask(String nameTask) throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']")).click();
        driver.findElement(By.xpath("//input[@data-testid=\"new-todo\"]")).sendKeys(nameTask);
        driver.findElement(By.xpath("//span[text()=\"Create Todo\"]")).click();
        return new ToDoPage(driver);
    }
    public boolean isdisplayeed(){

        boolean isWelcomDispalyed =  driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();
        return isWelcomDispalyed;
    }
}
