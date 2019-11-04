package com.t795.trpo.Liz.lab3.task.src.transport;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;

public class Subway extends ElectricTransport {

    Subway(ElectricEngineTypes engineType, String number, Routes routes) {
        super(engineType, number, routes);

    }

    public void run() {
        System.out.println("Subway is running");
    }
}
