package com.demo.tickets.ticketsapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Ticket {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String passport;
    private FlightDto flight;


    public Ticket(String name, String email, String passport, FlightDto flight) {
        this.name = name;
        this.email = email;
        this.passport = passport;
        this.flight = flight;

    }
}

