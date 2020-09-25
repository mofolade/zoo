package com.example.zooApp.controllers;

import com.example.zooApp.entities.Park;
import com.example.zooApp.services.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkController {

    @Autowired
    private ParkService parkService;

    @GetMapping("/rest/parks")
    public List<Park> getAllParks(){
        return parkService.getAllParks();
    }

    @GetMapping("/rest/parks/{id}")
    public Park getOnePark(@PathVariable int id){
        return parkService.getOnePark(id);
    }
}
