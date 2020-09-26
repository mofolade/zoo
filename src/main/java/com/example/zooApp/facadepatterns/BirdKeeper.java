package com.example.zooApp.facadepatterns;

public class BirdKeeper {
    private Birds toucan;
    private Birds owl;

    public BirdKeeper(){
        toucan = new Toucan();
        owl = new Owl();
    }
    public String toucanPresentation(){
        return toucan.birdSound() +"\n "+toucan.eat();
    }
    public String owlPresentation(){
        return owl.birdSound() +"\n "+owl.eat();
    }

}
