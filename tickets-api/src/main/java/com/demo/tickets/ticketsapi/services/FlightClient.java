package com.demo.tickets.ticketsapi.services;

import com.demo.tickets.ticketsapi.models.FlightDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "flight-server")
public interface FlightClient {
    @GetMapping("/flights")
    List<FlightDto> getAllFlights();
}

//@FeignClient(name = "flight-server")
//public interface FlightClient {
//    @GetMapping("/flights/{id}")
//    FlightDto getFlightById(@PathVariable("id") Long id);
//}
