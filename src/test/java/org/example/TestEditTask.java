package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestEditTask  extends SetProperity{
    @Test(priority = 1)
    public static  void test_complete_Task()throws InterruptedException{
        List<WebElement> checkBoxes =  driver.findElements(By.xpath("//input[@data-testid=\"complete-task\"]"));
        checkBoxes.get(2).click();
        Thread.sleep(2000);
        checkBoxes.get(2).click();

    }
    @Test(priority = 2)
    public static void test_delete_task() throws InterruptedException {
        for(int x =0;x<3;x++){
            List <WebElement> DeleteItems =
                    driver.findElements(By.xpath("//button[@data-testid=\"delete\"]"));
            DeleteItems.get(0).click();
            Thread.sleep(3000);
        }
        driver.quit();
    }
}
