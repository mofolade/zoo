package com.example.zooApp.entities;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromClassPath(fileName);
    }

    private String loadFromClassPath(String fileName) {
        return fileName;
    }

    @Override
    public String display() {
         return fileName;
    }


}
