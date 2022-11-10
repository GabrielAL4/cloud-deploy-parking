package com.parking.clouddeployproject.model;

public class Car {
    private String model;
    private String color;
    private String licensePlate;

    public Car(String model, String color, String licensePlate) {
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
    }

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
