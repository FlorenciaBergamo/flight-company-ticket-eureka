package com.demo.tickets.ticketsapi.services;

import com.demo.tickets.ticketsapi.Repository.TicketRepository;
import com.demo.tickets.ticketsapi.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public List<Ticket> allTickets (){
        return ticketRepository.findAll();
    }

    public void addTicket (Ticket ticket){
        ticketRepository.save(ticket);
    }

    public void deleteTicketById (Long id) {
        ticketRepository.deleteById(id);
    }
}
