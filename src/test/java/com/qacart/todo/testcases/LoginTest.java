package com.qacart.todo.testcases;

import com.qacart.todo.Pages.LoginPage;
import com.qacart.todo.Pages.NewToDoPage;
import com.qacart.todo.Pages.ToDoPage;
import com.qacart.todo.PropertiesUtil.ConfigUtil;
import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
@Feature("Login feature ")
public class LoginTest extends BaseTest {
@Story("Login using Email")
   @Test (description ="test case to login using email and password")
    public void ShouldBeAbleToLoginUsingEmailAndPassword() throws IOException, InterruptedException {
       RegisterApi registerApi = new RegisterApi();
       registerApi.register();

       getDriver().get(ConfigUtil.getInstance().getUrlPro());
       injectCookiesToBrowser(registerApi.getRestAssuredCookis());
       getDriver().get(ConfigUtil.getInstance().getUrlPro());
       WebElement checkWelcome=
               getDriver().findElement(By.cssSelector("[data-testid=\"welcome\"]"));

       boolean isReallyAppears = true;
        boolean isAppear=checkWelcome.isDisplayed();
        Assert.assertEquals(isReallyAppears,isAppear);

       Thread.sleep(Duration.ofSeconds(3));

   }


}
