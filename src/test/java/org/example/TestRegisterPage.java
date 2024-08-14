package org.example;

import org.checkerframework.checker.units.qual.s;
import org.example.SetProperity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRegisterPage extends SetProperity {
    @BeforeSuite
    public static void OpenSession(){
        SetProperity.openSession();
    }

        @Test (priority = 1)
        public void testLinkAppears(){
         WebElement signupText= driver.findElement(By.linkText("Signup"));
         String actualResult=signupText.getText();
            signupText.click();
            Assert.assertEquals(actualResult,"Signup");
        }
    @Test (priority = 2)
    public static void test_Fname_Field(){
        //Check From Filed Appears
        WebElement Fname_Field_Appears= driver.findElement(By.xpath("//label[text()='FirstName']"));
        Boolean fieldAppears=  Fname_Field_Appears.isDisplayed();
        //Enter Fname
        WebElement FirstnameText= driver.findElement(By.xpath("//input[@data-testid=\"first-name\"]"));
        FirstnameText.sendKeys("Mekki");
        Assert.assertTrue(fieldAppears);
    }
    @Test (priority = 3)
    public static void test_Lname_Field(){
        //Check From Filed Appears
        WebElement Lname_Field_Appears= driver.findElement(By.xpath("//label[text()='LastName']"));
        Boolean fieldAppears=  Lname_Field_Appears.isDisplayed();
        //Enter Lname
        WebElement LnameText= driver.findElement(By.xpath("//input[@data-testid=\"last-name\"]"));
        LnameText.sendKeys("Hassan Ahmed");
        Assert.assertTrue(fieldAppears);

    }
    @Test (priority = 4)
    public static void test_Email_Field(){
        //Check From Filed Appears
        WebElement Email_Field_Appears= driver.findElement(By.xpath("//label[text()='Email']"));
        Boolean fieldAppears=  Email_Field_Appears.isDisplayed();
        //enter email
        WebElement emailText= driver.findElement(By.xpath("//input[@data-testid=\"email\"]"));
        emailText.sendKeys("mekko@gmail.com");
        Assert.assertTrue(fieldAppears);
    }
    @Test (priority = 5)
    public static void test_Password_Field(){
        //Check From Filed Appears
        WebElement pass_Field_Appears= driver.findElement(By.xpath("//label[text()='Password']"));
        Boolean fieldAppears=  pass_Field_Appears.isDisplayed();
        //Enter password
        WebElement password_field= driver.findElement(By.xpath("//input[@data-testid=\"password\"]"));
        password_field.sendKeys("0123456789aA*");
        Assert.assertTrue(fieldAppears);
    }
    @Test (priority = 6)
    public static void test_ConfirmPassword_Field(){
        //Check From Filed Appears
        WebElement Conpass_Field_Appears= driver.findElement(By.xpath("//label[text()='Confirm Password']"));
        Boolean fieldAppears=  Conpass_Field_Appears.isDisplayed();
        //Enter Confirmation password
        WebElement password_field= driver.findElement(By.xpath("//input[@data-testid=\"confirm-password\"]"));
        password_field.sendKeys("0123456789aA*");
        Assert.assertTrue(fieldAppears);
    }

    @Test (priority = 7)
    public static void test_Submit_button(){
        //Check From Filed Appears
        WebElement button= driver.findElement(By.xpath("//button[@data-testid=\"submit\"]"));
        Boolean submitButtonAppear=  button.isDisplayed();
        button.click();
        Assert.assertTrue(submitButtonAppear);
    }
    @Test (priority = 8)
    public static void test_Logout_button() throws InterruptedException {
        Thread.sleep(4000);
        WebElement button= driver.findElement(By.xpath("//span[text()=\"Logout\"]"));
        Boolean submitButtonAppear=  button.isDisplayed();
        button.click();
        Assert.assertTrue(submitButtonAppear);
    }
}
