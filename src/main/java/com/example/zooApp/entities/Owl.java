package com.example.zooApp.entities;

public class Owl implements Birds {
    private int age;
    private String name;
    private double weight;

    public Owl(int age, String name, double weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String birdSound() {
        return"Owl: Who, who, who";
    }

    @Override
    public String eat() {
        return"Eat: invertebrates (insects, spiders, earthworms, snails and crabs), "+
                "fish, reptiles, amphibians, birds and small mammals";
    }

    @Override
    public String eatReptiles() {
        return "Owl eating reptiles.";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitOwl(this);
    }

}
