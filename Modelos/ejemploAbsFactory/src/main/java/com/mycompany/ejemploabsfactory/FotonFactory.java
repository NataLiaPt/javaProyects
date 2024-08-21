package com.mycompany.ejemploabsfactory;

public class FotonFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new FotonCar();
    }

    @Override
    public Truck createTruck() {
        return new FotonTruck();
    }
}
