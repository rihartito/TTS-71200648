package com.rplbo;

public class MotorVehicle extends Vehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmision;

    public Engine getEngine() {
        return engine;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Tire getTire() {
        return tire;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

}
