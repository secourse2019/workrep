package com.t795.trpo.Liz.lab3.task.src.people;

import com.t795.trpo.Liz.lab3.task.src.transport.GroundTransport;

public class Driver extends Person {

    Driver(String name, String surname){ super(name, surname); }

    public void fillFuel(GroundTransport transport){
        System.out.println("Fill fuel");
    }
}
