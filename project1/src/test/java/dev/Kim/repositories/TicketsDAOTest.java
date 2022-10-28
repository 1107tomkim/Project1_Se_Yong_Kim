package dev.Kim.repositories;

import dev.Kim.entities.Tickets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static dev.Kim.entities.Status.PENDING;

class TicketsDAOTest {

    static TicketsDAO ticketsDAO = new TicketsDAOPostgres();

    @Test
    @Order(1)
    void createTickets() {
        Tickets newTickets = new Tickets(0, 45.95f, "Pasta and pizza", 2, PENDING);
        Tickets savedTickets = ticketsDAO.createTickets(newTickets);
        Assertions.assertNotNull(savedTickets);
    }

    @Test
    @Order(2)
    void getTicketsById() {
        Tickets gTickets = ticketsDAO.getTicketsById(1);
        Assertions.assertNotNull(gTickets);
    }

    @Test
    @Order(3)
    void getPendingTickets() {
        List<Tickets> pendList = ticketsDAO.getPendingTickets();
        if(pendList.size() == 0){
            System.out.println("There are no pending tickets currently.");
        }
        Assertions.assertTrue(pendList.size() > 0);
    }

    @Test
    @Order(4)
    void getAllTickets() {
        List<Tickets> allList = ticketsDAO.getAllTickets();
        if(allList.size() == 0){
            System.out.println("There are currently no tickets in the Database.");
        }
        Assertions.assertTrue(allList.size() > 0);
    }

    @Test
    @Order(5)
    void getUserTickets() {
        List<Tickets> allUserList = ticketsDAO.getUserTickets(1);
        if (allUserList.size() == 0){
            System.out.println("There are currently no tickets for the user.");
        }
        Assertions.assertTrue(allUserList.size() > 0);
    }

    @Test
    @Order(6)
    // This testing is not currently working
    void updateStatus() {
        Tickets tickets = new Tickets(0, 129.95f, "New Keyboard", 3, PENDING);
        Tickets savedTickets = ticketsDAO.createTickets(tickets);
        System.out.println(savedTickets);

//        boolean statusVal = ticketsDAO.updateStatus(savedTickets.getId(), tickets.setStatus(APPROVED));

    }
}