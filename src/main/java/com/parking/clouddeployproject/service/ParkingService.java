package com.parking.clouddeployproject.service;

import com.parking.clouddeployproject.model.Car;
import com.parking.clouddeployproject.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap<>();
    static {
        var car = new Car();
        var car1 = new Car();
        car.setModel("Corolla");
        car.setColor("Vermelho");
        car.setLicensePlate("4SC7629");
        car1.setModel("Vectra");
        car1.setColor("Prata");
        car1.setLicensePlate("7SCV7423");
        var id = getUUID();
        var id1 = getUUID();
        Parking parking = new Parking(id, "SC", null, null, car);
        Parking parking1 = new Parking(id1, "SP", null, null, car1);
        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);

    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }
    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public Parking findByID(String id) {
        return parkingMap.get(id);
    }

    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setEntryHour(LocalDateTime.now());
        parkingMap.put(uuid, parkingCreate);
        return parkingCreate;
    }
}