package com.tutorial.service;

import com.tutorial.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketService implements ITicketService {

    @Override
    public List<Ticket> findAll() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1L, "NBA"));
        tickets.add(new Ticket(2L, "NHL"));
        return tickets;
    }
}
