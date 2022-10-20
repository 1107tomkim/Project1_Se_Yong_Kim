package dev.Kim.controllers;

import com.google.gson.Gson;
import dev.Kim.entities.User;
import io.javalin.http.Handler;
import org.postgresql.Driver;

public class UserContoller {
    public Handler createUser = (ctx) ->{
        String  json = ctx.body();
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        User registeredUser = Driver.userService.createUser(user);

    }
}
