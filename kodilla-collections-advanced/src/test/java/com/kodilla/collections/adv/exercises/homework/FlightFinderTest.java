package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void testShouldFindFlightsFrom(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("Katowice");
        assertEquals(2, flights.size());
    }
    @Test
    public void testShouldFindFlightsTo(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Rome");
        assertEquals(1, flights.size());
    }
}