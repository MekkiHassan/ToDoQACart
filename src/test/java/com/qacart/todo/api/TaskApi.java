package com.qacart.todo.api;

import com.github.javafaker.Faker;
import com.qacart.todo.Objects.Tasks;
import com.qacart.todo.PropertiesUtil.ConfigUtil;
import io.restassured.response.Response;
import org.apache.tools.ant.Task;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class TaskApi {

    private  String responstitem;
 private String id;

    public void addTask(String token, String taskName,boolean isCompleted) throws IOException {

          Tasks  task = new Tasks(taskName,isCompleted);
          Response response =
        given()
                .baseUri(ConfigUtil.getInstance().getUrlPro())
                .header("Content-Type","application/json")
                .body(task)
                .auth().oauth2(token)
         .when()
                .post("/api/v1/tasks")
         .then()
                .extract().response();
          responstitem = response.path("item");
           id =response.path("_id");

          if(response.statusCode()!=201){
               throw new RuntimeException("the task not created");
          }

      }
    public String getId() {
        return id;
    }
    public void setResponstitem(String responstitem) {
        this.responstitem = responstitem;
    }
    public String getResponstitem() {
        return responstitem;
    }


}
