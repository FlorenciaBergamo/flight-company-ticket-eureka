package com.demo.tickets.ticketsapi.controller;

import com.demo.tickets.ticketsapi.models.FlightDto;
import com.demo.tickets.ticketsapi.models.Ticket;
import com.demo.tickets.ticketsapi.services.FlightClient;
import com.demo.tickets.ticketsapi.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/Tickets")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @Autowired
    FlightClient flightClient;

    @GetMapping("/all")
    public List<Ticket> getAll(){
        return ticketService.allTickets();
    }

    @GetMapping("/flights")
    public List<FlightDto> getAllFlights(){
        return flightClient.getAllFlights();
    }

    @PostMapping("/add")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }

    @DeleteMapping("/delete/{ticket_id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicketById(id);
    }
}
