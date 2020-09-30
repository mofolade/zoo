package com.example.zooApp.entities;

public class Factory {
    //use getMammal method to get object of type Mammal
    public Birds getBirds(String birdType){
        if(birdType == null){
            return null;
        }
        if(birdType.equalsIgnoreCase("Toucan")){
            return new Toucan(12, "Tuci", 300);

        } else if(birdType.equalsIgnoreCase("Owl")){
            return new Owl(12, "Ronaldo", 200);
        }

        return null;
    }
}
