package dev.Kim.controllers;

import com.google.gson.Gson;
import dev.Kim.driver.Driver;
import dev.Kim.entities.Tickets;
import dev.Kim.repositories.TicketsDAO;
import io.javalin.http.Handler;

import java.util.List;

public class TicketsController {

    public Handler createTickets = (ctX) -> {
        String json = ctX.body(); //
        Gson gson = new Gson();
        Tickets tickets = gson.fromJson(json, Tickets.class);
        tickets.setUkey(Driver.login.getId());
        System.out.println(tickets);
        try {
            Tickets registeredTickets = Driver.ticketsService.createTickets(tickets);
            String userJson = gson.toJson(registeredTickets);
            ctX.status(201);
            ctX.result(userJson);
        }
        catch(RuntimeException e){
            e.printStackTrace();
            ctX.status(404);
            ctX.result(e.getMessage());
            }
    };

    public Handler getTicketsByIdHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        Tickets tickets = Driver.ticketsService.getTicketsById(id);
        Gson gson = new Gson();
        String json = gson.toJson(tickets);
        ctx.result(json);
    };

    public Handler getAllTickets = (ctx) ->{
        List<Tickets> tickets = Driver.ticketsService.getAllTickets();
        Gson gson = new Gson();
        String json = gson.toJson(tickets);
        ctx.result(json);
    };

    public Handler updateTicketsHandler = (ctx) ->{
        String userJson = ctx.body();
        Gson gson = new Gson();
        Tickets tickets =  gson.fromJson(userJson, Tickets.class);
        Tickets updateTickets = Driver.ticketsService.updateTickets(tickets);
        String json = gson.toJson(updateTickets);
        ctx.result(json);
    };

    public Handler deleteTicketsHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        boolean result =  Driver.ticketsService.deleteTicketsById(id);
        if(result){
            ctx.status(204);
        }
        else{
            ctx.status(400);
            ctx.result("Could not process delete ticket request!");
        }
    };

    public Handler getPendingTicketsHandler = (ctx) ->{
        try {
            List<Tickets> tickets = Driver.ticketsService.getPendingTickets();
            Gson gson = new Gson();
            String json = gson.toJson(tickets);
            ctx.result(json);
        }
        catch (RuntimeException e){
            ctx.status(404);
            ctx.result(e.getMessage());
        }
    };

    public Handler updateStatusHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        String ticketsJson = ctx.body();
        Gson gson = new Gson();
        Tickets tickets = gson.fromJson(ticketsJson, Tickets.class);
        tickets.setId(id);
        System.out.println("FROM CONTROLLER SIDE " + tickets);
        try{
            Tickets updateStatusTickets = Driver.ticketsService.updateStatus(tickets);
            String json = gson.toJson(updateStatusTickets);
            ctx.result(json);
        }
        catch (RuntimeException e){
            ctx.status(400);
            ctx.result(e.getMessage());
        }
    };

    public Handler getUserTicketsHandler = (ctx) ->{
        List<Tickets> tickets = Driver.ticketsService.getUserTickets(Driver.login.getId());
        Gson gson = new Gson();
        String json = gson.toJson(tickets);
        ctx.result(json);
    };

}
