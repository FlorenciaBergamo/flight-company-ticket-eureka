package com.demo.tickets.ticketsapi.services;

//import com.demo.tickets.ticketsapi.Repository.TicketRepository;
import com.demo.tickets.ticketsapi.models.Ticket;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TicketService {
    private final List<Ticket> tickets = new ArrayList<>();
    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket addTicket (Ticket addedTicket){
        tickets.add(addedTicket);
        return addedTicket;
    }

//    @Autowired
//    TicketRepository ticketRepository;
//
//    public List<Ticket> allTickets (){
//        return ticketRepository.findAll();
//    }
//
//    public void addTicket (Ticket ticket){
//        ticketRepository.save(ticket);
//    }
//
//    public void deleteTicketById (Long id) {
//        ticketRepository.deleteById(id);
//    }
}
