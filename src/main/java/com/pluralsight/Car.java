package com.pluralsight;

public class Car extends Vehicle {
    private int fuelCapactity;
    private int cargoCapacity;
    private int numberOfPassengers;
    private String color;

    // Getters
    private int getFuelCapactity(){
        return fuelCapactity;
    }
    private int getCargoCapacity(){
        return cargoCapacity;
    }
    private int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    private String getColor(){
        return color;
    }
}
