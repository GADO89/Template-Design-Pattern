package org.Template;
public class Executor {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        VehicleTemplate car=new Car();

        car.buildVehicle();

        System.out.println("_______________________");

        VehicleTemplate truck=new Truck();
        truck.buildVehicle();


    }
}