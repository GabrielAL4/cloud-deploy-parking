package com.parking.clouddeployproject.service;

import com.parking.clouddeployproject.model.Car;
import com.parking.clouddeployproject.model.Parking;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
