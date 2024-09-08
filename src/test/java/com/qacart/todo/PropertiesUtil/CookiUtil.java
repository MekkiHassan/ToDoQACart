package com.qacart.todo.PropertiesUtil;

import io.restassured.http.Cookie;

import java.util.ArrayList;
import java.util.List;

public class CookiUtil {
    public  static List<org.openqa.selenium.Cookie> convertRestAssuredCookiToSeleniumCooki(List<Cookie> restAssuredCooki){
        List <org.openqa.selenium.Cookie> seleniumCookis = new ArrayList<>();

        for( Cookie restAssuredCookis: restAssuredCooki){
           org.openqa.selenium.Cookie seleniumCooki = new org.openqa.selenium.Cookie(restAssuredCookis.getName(), restAssuredCookis.getValue());
            seleniumCookis.add(seleniumCooki);
        }
        return seleniumCookis;
    }
}
