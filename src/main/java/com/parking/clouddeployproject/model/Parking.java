package com.parking.clouddeployproject.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String id;
    private String state;
    private LocalDateTime entryHour;
    private LocalDateTime exitHour;
    private Car car;
    public Parking(String id, String state, LocalDateTime entryHour, LocalDateTime exitHour, Car car) {
        this.id = id;
        this.state = state;
        this.entryHour = entryHour;
        this.exitHour = exitHour;
        this.car = car;
    }

    public Parking() {}

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
