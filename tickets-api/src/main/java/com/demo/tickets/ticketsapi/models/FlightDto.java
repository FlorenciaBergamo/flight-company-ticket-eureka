package com.demo.tickets.ticketsapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class FlightDto {
    private Long id;
    private String origin;
    private String destiny;
    private LocalDateTime departureTime;
    private LocalDateTime arrivingTime;
    private double price;
    private String frequency;

}