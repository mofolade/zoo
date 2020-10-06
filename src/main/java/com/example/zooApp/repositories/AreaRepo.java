package com.example.zooApp.repositories;

import com.example.zooApp.entities.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AreaRepo extends CrudRepository<Area, Integer> {
    // findAll() SELECT * FROM area
    public Area findById(int id); // SELECT * FROM park WHERE id = ?
}
