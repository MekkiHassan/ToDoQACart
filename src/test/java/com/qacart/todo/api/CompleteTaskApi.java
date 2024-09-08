package com.qacart.todo.api;

import com.qacart.todo.Objects.CompletTask;
import com.qacart.todo.PropertiesUtil.ConfigUtil;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CompleteTaskApi {
    private String id;
    public void CompleteTask(String token,String taskName,boolean isCompleted) throws IOException {

            TaskApi taskApi = new TaskApi();
            taskApi.addTask(token,taskName,isCompleted);
           id= taskApi.getId();

        CompletTask completTask = new CompletTask( taskApi.getResponstitem(),isCompleted);
        given().
                baseUri(ConfigUtil.getInstance().getUrlPro())
                .header("Content-Type","application/json")
                .auth().oauth2(token)
                .body(completTask)
        .when()
                .put("/api/v1/tasks/"+id+"")
        .then().extract().body();



    }
}
