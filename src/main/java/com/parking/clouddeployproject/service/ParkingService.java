package com.parking.clouddeployproject.service;

import com.parking.clouddeployproject.model.Car;
import com.parking.clouddeployproject.model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap<>();
    static {
        var car = new Car();
        car.setModel("Corolla");
        car.setColor("Vermelho");
        car.setLicensePlate("4SC7629");
        var id = getUUID();
        Parking parking = new Parking(id, "SC", null, null, car);
        parkingMap.put(id, parking);
    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());

    }
    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
