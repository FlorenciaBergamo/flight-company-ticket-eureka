
package com.codoacodo.vuelosapi.utils;

import com.codoacodo.vuelosapi.models.Flight;
import com.codoacodo.vuelosapi.models.FlightDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightUtils {

    public List<Flight> detectOffers(List<Flight> flights, Integer offerPrice) {
        return flights.stream()
                .filter(flight -> flight.getPrice() < offerPrice)
                .collect(Collectors.toList());
    }


    public List<FlightDto> flightMapper(List<Flight> flights, double price){
        List<FlightDto> flightDtos = new ArrayList<>();
        for(Flight flight : flights){
            flightDtos.add(new FlightDto(flight.getId(), flight.getOrigin(), flight.getDestiny(), flight.getDepartureTime(),
                    flight.getArrivingTime(), flight.getPrice() * price, flight.getFrequency(), flight.getCompany()));
        }
        return flightDtos;
        }
    }
