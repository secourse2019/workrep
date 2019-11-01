package com.t795.trpo.Liz.lab3.task.src.vehicles;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;
import com.t795.trpo.Liz.lab3.task.src.transport.ElectricEngineTypes;
import com.t795.trpo.Liz.lab3.task.src.transport.ElectricTransport;

public class Trolley extends ElectricTransport{
    public Trolley(ElectricEngineTypes engineType, String number, Routes routes) {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Trolley is running");
    }
}
