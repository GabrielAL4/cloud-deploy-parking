package com.parking.clouddeployproject.controller;

import com.parking.clouddeployproject.model.Car;
import com.parking.clouddeployproject.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    @GetMapping
    public List<Parking> findAll(){
        var car = new Car();
        car.setModel("Corolla");
        car.setColor("Vermelho");
        car.setLicensePlate("4SC7629");

        var parking = new Parking();
        parking.setId("12354681");
        parking.setState("SP");
        parking.setEntryHour(null);
        parking.setExitHour(null);
        parking.setCar(car);

        return Arrays.asList(parking);
    }
}
