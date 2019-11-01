package com.t795.trpo.Liz.lab3.task.src.transport;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;

public abstract class ElectricTransport extends GroundTransport{

    private ElectricEngineTypes engineType;

    public ElectricTransport(ElectricEngineTypes engineType, String number, Routes routes){
        super(number, routes);
        this.engineType = engineType;
    }

    public ElectricEngineTypes getEngineType() {
        return engineType;
    }

    public void setEngineType(ElectricEngineTypes engineType) {
        this.engineType = engineType;
    }
}
