package com.example.zooApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "park")
public class Park {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Enables Autoincrement
    private int id;

    private String name;
    private String description;
    @Column(name = "imagepath") private String imagepath;

    public Park() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagepath;
    }

    public void setImagePath(String photo) {
        this.imagepath = imagepath;
    }
}
