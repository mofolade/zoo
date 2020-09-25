package com.example.zooApp.entities;

import javax.swing.*;
import java.util.Date;

//Monkey inheriting the properties of Mammal
public class Monkey extends Mammal
{
    //Constructor
    public Monkey(String name, Date dateOfBirth)
    {
    //Passing name and dataOfBirth to the super class's constructor.
        super(name, dateOfBirth);
    }

    //Implementing abstract methods inherited
    @Override
    public void eat()
    {
        JOptionPane.showMessageDialog(null, "I am a monkey called " + getName() + " eating");
    }

    //Implementing abstract methods inherited
    @Override
    public void sleep()
    {
        JOptionPane.showMessageDialog(null, "I am a monkey called " + getName() + " sleeping");
    }

    //Implementing abstract methods inherited
    @Override
    public void walk()
    {
        JOptionPane.showMessageDialog(null, "I am a monkey called " + getName() + " jumping");
    }
}