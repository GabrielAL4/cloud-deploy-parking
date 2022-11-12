package com.parking.clouddeployproject.controller.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.parking.clouddeployproject.model.Car;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingDTO {
    private String id;
    private String state;
    private LocalDateTime entryHour;
    private LocalDateTime exitHour;
    private Car car;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(LocalDateTime entryHour) {
        this.entryHour = entryHour;
    }

    public LocalDateTime getExitHour() {
        return exitHour;
    }

    public void setExitHour(LocalDateTime exitHour) {
        this.exitHour = exitHour;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
