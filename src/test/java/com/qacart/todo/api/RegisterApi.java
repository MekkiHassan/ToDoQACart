package com.qacart.todo.api;

import com.qacart.todo.Objects.User;
import com.qacart.todo.PropertiesUtil.UserUtils;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterApi {
    private  String firstName;
  private List<Cookie> restAssuredCookies ;


    private  String token ;

  public void  register(){
            User user = new UserUtils().createNewuser();
         Response  response  =
                 given()
                    .baseUri("https://todo.qacart.com")
                    .header("Content-Type","application/json")
                    .body(user)
                 .when()
                    .post("/api/v1/users/register")
                 .then()
                    .extract().response();
            restAssuredCookies = response.detailedCookies().asList();
            firstName = response.path("firstName");
             token = response.path("access_token");
        }
    public String getFirstName() {

            return firstName;
    }
    public String getToken() {
        return token;
    }


    public List <Cookie> getRestAssuredCookis(){

            return  restAssuredCookies;
    }



}
