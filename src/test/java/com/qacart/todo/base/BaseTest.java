package com.qacart.todo.base;

import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.PropertiesUtil.CookiUtil;
import io.qameta.allure.Allure;
import io.restassured.http.Cookie;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BaseTest {

    protected ThreadLocal <WebDriver> driver = new ThreadLocal<>();
    public WebDriver getDriver() {
        return this.driver.get();
    }

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    @BeforeMethod
        public void setUp(){
           WebDriver  driver= new DriverFactory().initializDriver();
           setDriver(driver);
        }

     @AfterMethod
       public void teatDown(ITestResult result) throws IOException {
            String TestCaseName=result.getMethod().getMethodName();
           File path = new File ("src/test/Screens"+File.separator+TestCaseName+".png");
           TakeScreen(path);
         InputStream is = new FileInputStream(path);
         Allure.addAttachment("screenShot",is);
         getDriver().quit();
       }

public void injectCookiesToBrowser (List<Cookie> restAssuredCooki ){
   List <org.openqa.selenium.Cookie>seleniumCookis=
           CookiUtil.convertRestAssuredCookiToSeleniumCooki(restAssuredCooki);
               for (org.openqa.selenium.Cookie cookis:seleniumCookis){
               getDriver().manage().addCookie(cookis);
           }
    }

public void TakeScreen(File path) throws IOException {
        File file = ((TakesScreenshot)getDriver() ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,path);
}
}


