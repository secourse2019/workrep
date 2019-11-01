package com.t795.trpo.Liz.lab3.task.src.transport;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;

public abstract class FuelTransport extends GroundTransport {

    private Integer engineType;

    public FuelTransport(Integer engineType, String number, Routes routes){
        super(number, routes);
        this.engineType = engineType;
    }

    public Integer getEngineType() {
        return engineType;
    }

    public void setEngineType(Integer engineType) {
        this.engineType = engineType;
    }
}
