package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> list = FlightBuilder.createFlights();

        System.out.println(FilterModule.filter(list, FilterModule.DEPARTURE_DATE_IS_BEFORE_NOW));

        System.out.println();
        System.out.println();

        System.out.println(FilterModule.filter(list, FilterModule.WRONG_ARRIVAL_DATE));

        System.out.println();
        System.out.println();

        System.out.println(FilterModule.filter(list, FilterModule.TRANSFER_MORE_THEN_TWO_HOURS));

        System.out.println();
        System.out.println();

    }
}