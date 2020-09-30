package com.example.zooApp.entities;

public interface Visitor {

    public String visitToucan(Toucan toucan);
    public String visitOwl(Owl owl);

}
