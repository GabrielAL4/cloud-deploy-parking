package com.parking.clouddeployproject.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Main Controler")
public class MainController {

    @GetMapping
    @ApiOperation("Showcase Method")
    public String hello(){
        return "Hello World";
    }

}
