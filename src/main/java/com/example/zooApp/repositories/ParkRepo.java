package com.example.zooApp.repositories;

import com.example.zooApp.entities.Park;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkRepo extends CrudRepository<Park, Integer> {
    // findAll() SELECT * FROM park
    public Park findById(int id); // SELECT * FROM park WHERE id = ?
}
