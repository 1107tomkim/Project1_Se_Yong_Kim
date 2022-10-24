package dev.Kim.controllers;

import com.google.gson.Gson;
import dev.Kim.entities.User;
import io.javalin.http.Handler;
import dev.Kim.driver.Driver;

import java.util.List;

public class UserContoller {

    public Handler createUser = (ctx) ->{
        String  json = ctx.body();
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        User registeredUser = Driver.userService.createUser(user);
        String userJson = gson.toJson(registeredUser);
        ctx.status(201);
        ctx.result(userJson);
    };

    public Handler getUserByIdHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));//This will take what value was in the {id} and turn it into an int for us to use
        User user = Driver.userService.getUserById(id);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        ctx.result(json);
    };

    public Handler getAllUsers = (ctx) ->{
        List<User> users = Driver.userService.getAllUsers();
        Gson gson = new Gson();
        String json = gson.toJson(users);
        ctx.result(json);
    };

    public Handler updateUserHandler = (ctx) ->{
        String userJSON = ctx.body();
        Gson gson = new Gson();
        User user = gson.fromJson(userJSON, User.class);
        User updateUser = Driver.userService.UpdateUser(user);
        String json = gson.toJson(updateUser);
        ctx.result(json);
    };


    public Handler deleteUserHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        boolean result = Driver.userService.deleteUserById(id);
        if(result){
            ctx.status(204);
        }
        else{
            ctx.status(400);
            ctx.result("Could not process your delete request");
        }
    };

}
