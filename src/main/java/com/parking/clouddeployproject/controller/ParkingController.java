package com.parking.clouddeployproject.controller;

import com.parking.clouddeployproject.controller.DTO.ParkingCreateDTO;
import com.parking.clouddeployproject.controller.DTO.ParkingDTO;
import com.parking.clouddeployproject.controller.mapper.ParkingMapper;
import com.parking.clouddeployproject.model.Parking;
import com.parking.clouddeployproject.service.ParkingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
@Api(tags = "Parking Controller")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;
    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    @ApiOperation("Find all Parkings")
    public ResponseEntity<List<ParkingDTO>> findAll(){
        List<Parking> parkingList = parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find Parking with search by ID")
    public ResponseEntity <ParkingDTO> findByID(@PathVariable String id){
        Parking parking = parkingService.findByID(id);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);

        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/{id}")
    @ApiOperation("Delete an existent parking")
    public ResponseEntity delete(@PathVariable String id){
        parkingService.delete(id);
        return  ResponseEntity.noContent().build();
    }
    @PostMapping
    @ApiOperation("Create a new parking")
    public ResponseEntity <ParkingDTO> create(@RequestBody ParkingCreateDTO parkingDTO){
        var parkingCreate = parkingMapper.toParkingCreate(parkingDTO);
        Parking parking = parkingService.create(parkingCreate);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update an existent parking")
    public ResponseEntity <ParkingDTO> update(@PathVariable String id, @RequestBody ParkingCreateDTO parkingDTO){
        var parkingUpdate = parkingMapper.toParkingCreate(parkingDTO);
        Parking parking = parkingService.update(id, parkingUpdate);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
