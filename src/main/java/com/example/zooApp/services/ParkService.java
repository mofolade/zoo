package com.example.zooApp.services;

import com.example.zooApp.entities.Park;
import com.example.zooApp.repositories.ParkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkService {

    @Autowired
    private ParkRepo parkRepo;

    public Park getOnePark(int id){
        return parkRepo.findById(id);
    }

    public List<Park> getAllParks(){
        return (List<Park>) parkRepo.findAll();
    }

    public Park createPark(Park park) {
        return parkRepo.save(park);
    }
}
