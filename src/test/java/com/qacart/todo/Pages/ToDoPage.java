package com.qacart.todo.Pages;

import com.qacart.todo.PropertiesUtil.ConfigUtil;
import com.qacart.todo.base.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ToDoPage extends BasePages {
    public ToDoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath="//input[@data-testid=\"complete-task\"]")
    public WebElement checkBoxes ;
    @FindBy (xpath="//button[@data-testid=\"delete\"]")
    WebElement DeleteItem;
    public void load() throws IOException {
            driver.get(ConfigUtil.getInstance().getUrlPro()+"/todo");
    }

    public String msgTextAfterAddTask( ){
        return    driver.findElement(By.cssSelector( "[data-testid=\"todo-text\"]") ).getText();
    }



}
