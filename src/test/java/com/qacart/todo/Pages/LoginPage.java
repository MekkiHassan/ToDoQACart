package com.qacart.todo.Pages;

import com.qacart.todo.PropertiesUtil.ConfigUtil;
import com.qacart.todo.PropertiesUtil.LoadProperties;
import com.qacart.todo.base.BasePages;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.Properties;

public class LoginPage  extends  BasePages  {

    public LoginPage(WebDriver  driver) {
        super(driver);
    }
        @FindBy(xpath = "//input[@data-testid=\"email\"]")
        private WebElement emailInput;
        @FindBy(xpath = "//input[@data-testid=\"password\"]")
        private WebElement passwordInput;
        @FindBy(id = "submit")
        private WebElement submit;

    public LoginPage load() throws IOException {

        driver.get( ConfigUtil.getInstance().getUrlPro() );
        return this;
    }
    public  NewToDoPage loginmethod(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submit.click();
        return new NewToDoPage(driver);
    }



}
