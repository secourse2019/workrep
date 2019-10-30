package com.t795.trpo.Liz.lab3.task.src.geolocation;

import java.util.Map;

public class Geolocation {

    private Map<Coordinates, Address> geolocation;

    Geolocation(Coordinates coordinates, Address adress) {
        this.geolocation.put(coordinates, adress);
    }
}
