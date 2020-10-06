package com.example.zooApp.entities;

//Monkey inheriting the properties of Mammal
public class Monkey extends Mammal
{
    //Constructor
    public Monkey(String name, String placeOfBirth, String description)
    {
        //Passing name and placeOfBirth, description to the super class's constructor.
        super(name, placeOfBirth,description);
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
        return("ohh ohh ah ah ooh ooh");
    }
}