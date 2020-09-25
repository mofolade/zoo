package com.example.zooApp.entities;
import java.util.Date;

public abstract class Mammal {
    private Date dateOfBirth = null;
    private String name = null;


    //A constructor
    public Mammal(String name, Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public Date getAge(Date now)
    {
        long time = now.getTime() - dateOfBirth.getTime();
        Date t = new Date(time);
        return t;
    }

    //This are abstract methods which MUST be
    //implemented by the subclass.
    public abstract void eat();

    public abstract void sleep();

    public abstract void walk();

}
