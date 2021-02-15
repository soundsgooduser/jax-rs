package com.tutorial.api;

import com.tutorial.model.Ticket;
import com.tutorial.service.ITicketService;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("tickets")
public class TicketResource {

    @Inject
    private ITicketService ticketService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ticket> getTickets() {
        List<Ticket> tickets = ticketService.findAll();
        return tickets;
    }
}
