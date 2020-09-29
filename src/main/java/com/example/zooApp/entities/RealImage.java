package com.example.zooApp.entities;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName; //'../resources/images/orkide.jpg';
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
