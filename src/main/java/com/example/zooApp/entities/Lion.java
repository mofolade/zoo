package com.example.zooApp.entities;

//@Entity
//@Table(name = "lion")
public class Lion extends Mammal{
    //Constructor
    public Lion(String name, String placeOfBirth, String description) {
        super(name, placeOfBirth, description);
    }

    @Override
    public String getPlaceOfBirth() {
        return super.getPlaceOfBirth();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    //Implementing abstract method inherited
    @Override
    public String makeYourSpecialNoise() {
        return("ROARR!!");
    }

}