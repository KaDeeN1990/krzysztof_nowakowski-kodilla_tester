package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightsTable){
            if (flight.getDepartue().equals(departure)){
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightsTable){
            if (flight.getArrival().equals(arrival)){
                result.add(flight);
            }
        }
        return result;
    }
}
