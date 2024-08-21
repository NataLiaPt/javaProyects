package com.mycompany.ejemploabsfactory;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Car createCar(){
        return new ToyotaCar();
    }
    @Override
    public Truck createTruck(){
        return new ToyotaTruck();
    }
    
}
