package com.mycompany.ejemploabsfactory;

public class VehicleClient {

    public static void main(String[] args) {
        VehicleFactory factory = new  ToyotaFactory();
        Car car = factory.createCar();
        car.drive();
        
        Truck truck = factory.createTruck();
        truck.load();
        
        factory = new FotonFactory();
        car = factory.createCar();
        car.drive();
        
        truck = factory.createTruck();
        truck.load();
        
        factory = new MercedesFactory();
        car = factory.createCar();
        car.drive();
        
        truck = factory.createTruck();
        truck.load();
    }
}
