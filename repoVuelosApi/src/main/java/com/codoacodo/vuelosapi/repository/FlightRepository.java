package com.codoacodo.vuelosapi.repository;

import com.codoacodo.vuelosapi.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

//    List<Flight> findByOrigin(String origin);
//    List<Flight> findByOriginAndDestiny(String origin, String destiny);
}
