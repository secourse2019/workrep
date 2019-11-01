package com.t795.trpo.Liz.lab3.task.src.vehicles;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;
import com.t795.trpo.Liz.lab3.task.src.transport.FuelTransport;


public class Bus extends FuelTransport {

    Bus(Integer engineType, String number, Routes routes)
    {
        super(engineType, number, routes);
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }
}
