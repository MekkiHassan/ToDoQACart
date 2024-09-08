package com.qacart.todo.PropertiesUtil;

import com.github.javafaker.Faker;
import com.qacart.todo.Objects.User;

public class UserUtils {
    public User getRandomUsers(){
        String firstnName = new Faker().name().firstName();
        String lastName = new Faker().name().lastName();
        String email = new Faker().internet().emailAddress();
        String password = new Faker().internet().password();
        User user
                 = new User(email,password,firstnName,lastName);
        return user;

    }
    public User createNewuser(){
        String Fname = new Faker().name().firstName();
        String Lname= new Faker().name().lastName();
        String Email = new Faker().internet().emailAddress();
        String pass = new Faker().internet().password();
        User user = new User(Email,pass,Fname,Lname);
        return user;
    }
}
