package com.mycompany.ejemploabsfactory;

public class MercedesFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new MercedesCar();
    }

    @Override
    public Truck createTruck() {
        return new MercedesTruck();
    }

    
}
