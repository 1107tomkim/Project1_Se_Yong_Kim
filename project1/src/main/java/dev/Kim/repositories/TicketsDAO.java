package dev.Kim.repositories;


import dev.Kim.entities.Tickets;

import java.util.List;

// CRUD IMPLEMENTATION
public interface TicketsDAO {
    Tickets createTickets(Tickets tickets);

    Tickets getTicketsById(int id);
    List<Tickets> getPendingTickets();

    List<Tickets> getAllTickets();

    Tickets updateTickets(Tickets tickets);

    boolean deleteTicketsById(int id);
}
