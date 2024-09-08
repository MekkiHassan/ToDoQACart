package com.qacart.todo.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DriverFactory {
    WebDriver driver;
    public WebDriver initializDriver() throws RuntimeException {

        String browser=System.getProperty("browser","CHROME");

        switch (browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                 driver= new ChromeDriver();
                    break;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                 driver= new EdgeDriver();
                 break;
            default:
                throw new RuntimeException("This browser is not supported");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }

}
