package com.rplbo;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String solar, int i) {
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
