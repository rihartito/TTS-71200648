package com.rplbo;

public class Truck extends MotorVehicle {
    private int capacity;

    public Truck(Engine dieselEngine, Transmision manualTransmision, Tire trailTire, Wheel truckWheel, int i) {
        super();
    }

    @Override
    public void backward() {
        super.backward();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void forward() {
        super.forward();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void setVehicleName(String vehicleName) {
        super.setVehicleName(vehicleName);
    }
}
