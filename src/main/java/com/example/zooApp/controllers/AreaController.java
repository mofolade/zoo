package com.example.zooApp.controllers;

import com.example.zooApp.entities.Area;
import com.example.zooApp.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    //get all areas from db
    @GetMapping("/rest/areas")
    public List<Area> getAllAreas(){ return areaService.getAllAreas(); }

    //get one area from db by id
    @GetMapping("/rest/parks/{id}")
    public Area getOneArea(@PathVariable int id){
        return areaService.getOneArea(id);
    }
}
