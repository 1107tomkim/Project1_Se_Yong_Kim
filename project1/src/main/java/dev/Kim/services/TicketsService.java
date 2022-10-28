package dev.Kim.services;


import dev.Kim.entities.Tickets;

import java.util.List;

// CRUD OPERATION
public interface TicketsService {
    Tickets createTickets(Tickets tickets);

    Tickets getTicketsById(int id);

    List<Tickets> getPendingTickets();
    List<Tickets> getAllTickets();
    List<Tickets> getUserTickets(int id);
    List<Tickets> getUserTicketsbyType(int id, String rtypes);

    Tickets updateTickets(Tickets tickets);

    Tickets updateStatus(Tickets tickets);

    boolean deleteTicketsById(int id);
}
