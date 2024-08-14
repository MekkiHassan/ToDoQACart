package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SetProperity {
    public static  WebDriver driver;
    public static void openSession(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com");
        driver.manage().window().maximize();
    }


}
