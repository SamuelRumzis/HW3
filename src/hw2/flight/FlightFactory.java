package hw2.flight;

import edu.depaul.se350.flyweight.vehicle.Vehicle;
import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class FlightFactory {

    private static Map<String, Flight> flightCache = new HashMap<>();

    private FlightFactory() {}

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        else return null;
    }
}
