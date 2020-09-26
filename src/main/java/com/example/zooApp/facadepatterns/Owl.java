package com.example.zooApp.facadepatterns;

public class Owl implements Birds {

    @Override
    public String birdSound() {
        return"Owl: Who, who, who";
    }

    @Override
    public String eat() {
        return"Eat: invertebrates (insects, spiders, earthworms, snails and crabs), "+
                "fish, reptiles, amphibians, birds and small mammals";
    }

}
