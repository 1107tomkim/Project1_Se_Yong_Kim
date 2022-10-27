package dev.Kim.services;


import dev.Kim.entities.Tickets;

import java.util.List;

// CRUD OPERATION
public interface TicketsService {
    Tickets createTickets(Tickets tickets);

    Tickets getTicketsById(int id);

    List<Tickets> getPendingTickets();
    List<Tickets> getAllTickets();

    Tickets updateTickets(Tickets tickets);

    boolean deleteTicketsById(int id);
}
