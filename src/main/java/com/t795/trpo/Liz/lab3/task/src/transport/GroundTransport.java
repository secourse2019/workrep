package com.t795.trpo.Liz.lab3.task.src.transport;

import com.t795.trpo.Liz.lab3.task.src.traffic.Routes;

public abstract class GroundTransport extends Transport {
    private Routes routes;

    public GroundTransport(String number, Routes routes) {
        super(number);
        this.routes = routes;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }
}
