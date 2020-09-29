package com.example.zooApp.services;

import com.example.zooApp.entities.Area;
import com.example.zooApp.repositories.AreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepo areaRepo;

    public Area getOneArea(int id){
        return areaRepo.findById(id);
    }

    public List<Area> getAllAreas(){
        return (List<Area>) areaRepo.findAll();
    }

    public Area createPark(Area area) {
        return areaRepo.save(area);
    }
}
