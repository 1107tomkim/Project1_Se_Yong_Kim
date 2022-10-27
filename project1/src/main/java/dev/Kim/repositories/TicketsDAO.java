package dev.Kim.repositories;


import dev.Kim.entities.Tickets;

import java.util.List;

// CRUD IMPLEMENTATION
public interface TicketsDAO {
    Tickets createTickets(Tickets tickets);

    Tickets getTicketsById(int id);
    List<Tickets> getPendingTickets();

    List<Tickets> getAllTickets();

    List<Tickets> getUserTickets(int id);

    Tickets updateTickets(Tickets tickets);
    Tickets updateStatus(Tickets tickets);

    boolean deleteTicketsById(int id);
}
