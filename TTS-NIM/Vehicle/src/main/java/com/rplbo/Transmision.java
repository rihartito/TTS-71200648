package com.rplbo;

public class Transmision {
    private String transType;
    private int rumSpeed;

    public Transmision(String manual, int i) {
    }

    public int getRumSpeed() {
        return rumSpeed;
    }

    public String getTransType() {
        return transType;
    }

    public void setRumSpeed(int rumSpeed) {
        this.rumSpeed = rumSpeed;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}
