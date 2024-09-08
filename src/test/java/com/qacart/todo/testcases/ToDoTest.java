package com.qacart.todo.testcases;

import com.github.javafaker.Faker;
import com.qacart.todo.Pages.LoginPage;

import com.qacart.todo.Pages.ToDoPage;
import com.qacart.todo.api.CompleteTaskApi;
import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.api.TaskApi;
import com.qacart.todo.base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
@Feature("To do feature ")
public class ToDoTest extends BaseTest {
    String taskName ;
    boolean isCompleted;
    String token ;
    String nameTask ;
    boolean  isComplestedOrNot;

    @Story("Add to do Task")
    @Test (description = "test case to add new task")
    public  void ShouldBeAbleToAddNewTasks() throws InterruptedException, IOException {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Faker faker = new Faker();
        nameTask =  faker.address().streetAddress();
        isComplestedOrNot=faker.bool().bool();

        RegisterApi registerApi = new RegisterApi();
        registerApi.register();

        TaskApi taskApi= new TaskApi();
        taskApi.addTask(registerApi.getToken(),nameTask,isComplestedOrNot);
        ToDoPage toDoPage = new ToDoPage( getDriver() );
        toDoPage.load();
        injectCookiesToBrowser(registerApi.getRestAssuredCookis());
        toDoPage.load();
        taskApi.getResponstitem();
        String act = toDoPage.msgTextAfterAddTask();
        Assert.assertEquals(act,nameTask);
    }
    @Story("Complete to do Task")
    @Test (description = "test case to make complete task")
    public   void CompleteTask() throws InterruptedException, IOException {
            RegisterApi registerApi = new RegisterApi();
            registerApi.register();
            token= registerApi.getToken();

         Faker faker = new Faker();
            taskName = faker.name().firstName();
            isCompleted = true;

          CompleteTaskApi completeTaskApi = new CompleteTaskApi();
             completeTaskApi.CompleteTask(token,taskName,isCompleted);

            ToDoPage toDoPage = new ToDoPage(getDriver());
            toDoPage.load();
            injectCookiesToBrowser(registerApi.getRestAssuredCookis() );
                 toDoPage.load();
                 Thread.sleep(Duration.ofSeconds(3));

    }
}
