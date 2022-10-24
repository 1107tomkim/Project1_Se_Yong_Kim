package dev.Kim.driver;

import dev.Kim.controllers.UserContoller;
import dev.Kim.entities.User;
import dev.Kim.repositories.UserDAOPostgres;
import dev.Kim.services.UserService;
import dev.Kim.services.UserServiceImpl;
import io.javalin.Javalin;

public class Driver {

    public static UserService userService = new UserServiceImpl(new UserDAOPostgres());

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        UserContoller userContoller = new UserContoller();

        app.get("/user/{id}", userContoller.getUserByIdHandler);
        app.get("/user", userContoller.getAllUsers);
        app.post("/user", userContoller.createUser);
        app.put("/user", userContoller.updateUserHandler);
        app.delete("/user/{id}", userContoller.deleteUserHandler);

        app.start(3001);
    }
}
