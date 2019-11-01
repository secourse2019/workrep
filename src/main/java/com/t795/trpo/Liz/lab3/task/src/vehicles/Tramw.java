package com.t795.trpo.Liz.lab3.task.src.vehicles;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;
import com.t795.trpo.Liz.lab3.task.src.transport.ElectricEngineTypes;
import com.t795.trpo.Liz.lab3.task.src.transport.ElectricTransport;

public class Tramw extends ElectricTransport{

    public Tramw(ElectricEngineTypes engineType, String number, Routes routes) {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Tram is running");
    }
}
