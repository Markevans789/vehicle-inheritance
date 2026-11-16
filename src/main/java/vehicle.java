package com.pluralsight;

public class vehicle {
    private int fuelCapacity;
    private int cargoCapacity;
    private int numberOfPassengers;
    private String color;

    // Getters
    public int getFuelCapacity(){
        return fuelCapacity;
    }

    public int getCargoCapacity(){
        return cargoCapacity;
    }

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void
    setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
