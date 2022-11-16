package com.parking.clouddeployproject.controller.DTO;

import com.parking.clouddeployproject.model.Car;

public class ParkingCreateDTO {
    private String state;
    private Car car;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
