package com.example.zooApp.entities;

public class BirdKeeper {
    private Birds toucan;
    private Birds owl;

    public BirdKeeper(){
        toucan = new Toucan(12, "Toucanoo", 300);
        owl = new Owl(12, "Ronaldo", 200);
    }
    public String toucanPresentation(){
        return toucan.birdSound() +"\n "+toucan.eat();
    }
    public String owlPresentation(){
        return owl.birdSound() +"\n "+owl.eat();
    }

}
