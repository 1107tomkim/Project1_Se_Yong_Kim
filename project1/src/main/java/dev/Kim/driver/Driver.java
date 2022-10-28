package dev.Kim.driver;

import dev.Kim.controllers.TicketsController;
import dev.Kim.controllers.UserContoller;
import dev.Kim.entities.User;
import dev.Kim.repositories.TicketsDAOPostgres;
import dev.Kim.repositories.UserDAOPostgres;
import dev.Kim.services.TicketsService;
import dev.Kim.services.TicketsServiceImpl;
import dev.Kim.services.UserService;
import dev.Kim.services.UserServiceImpl;
import io.javalin.Javalin;

public class Driver {

    public static UserService userService = new UserServiceImpl(new UserDAOPostgres());
    public static TicketsService ticketsService = new TicketsServiceImpl(new TicketsDAOPostgres());

    public static User login = null;

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        UserContoller userContoller = new UserContoller();

        app.get("/user/{id}", userContoller.getUserByIdHandler);
        app.get("/user", userContoller.getAllUsers);
        app.post("/user", userContoller.createUser);
        app.put("/user", userContoller.updateUserHandler);
        app.delete("/user/{id}", userContoller.deleteUserHandler);


        TicketsController ticketsController = new TicketsController();

        app.get("/tickets/byid/{id}", ticketsController.getTicketsByIdHandler );
        app.get("/tickets", ticketsController.getAllTickets);
        app.post("/tickets", ticketsController.createTickets);
        app.put("/tickets", ticketsController.updateTicketsHandler);
        app.delete("/tickets/{id}", ticketsController.deleteTicketsHandler);

        app.get("/tickets/pending", ticketsController.getPendingTicketsHandler);
        app.put("/updateStatus/{id}", ticketsController.updateStatusHandler);
        app.get("/getUserTickets", ticketsController.getUserTicketsHandler);

        app.post("/login", userContoller.loginUserHandler);
        app.get("/logout",  userContoller.logoutUserHandler);

        // STRETCH GOALS
        app.get("/getUserTickets/{rtypes}", ticketsController.getUserTicketsByrTypes);
        app.put("/updaterole/{id}", userContoller.changeRoleHandler);




        app.start();
    }
}
