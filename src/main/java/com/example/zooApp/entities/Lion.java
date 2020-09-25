package com.example.zooApp.entities;

import javax.swing.*;
import java.util.Date;

public class Lion extends Mammal{
    //Constructor
    public Lion(String name, Date dateOfBirth) {
        super(name, dateOfBirth);
    }

    //Implementing abstract method inherited
    @Override
    public void eat()
    {
        JOptionPane.showMessageDialog(null, "I am a Lion called " + getName() + " eating");
    }

    //Implementing abstract methods inherited
    @Override
    public void sleep()
    {
        JOptionPane.showMessageDialog(null, "I am a Lion called " + getName() + " sleeping");
    }

    //Implementing abstract methods inherited
    @Override
    public void walk()
    {
        JOptionPane.showMessageDialog(null, "I am a Lion called " + getName() + " walking");
    }

}