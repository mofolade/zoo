package com.example.zooApp.controllers;

import com.example.zooApp.entities.Birds;
import com.example.zooApp.entities.Owl;
import com.example.zooApp.entities.Toucan;
import com.example.zooApp.entities.Visitor;

public class XMLExportVisitor implements Visitor {

    public String export(Birds... args) {
        StringBuilder sb = new StringBuilder();
        //xml header
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Birds birds : args) {
            sb.append(birds.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitToucan(Toucan toucan) {
        //xml source with data of toucan object
        return "<toucan>" + "\n" +
                "    <age>" + toucan.getAge() + "</age>" + "\n" +
                "    <name>" + toucan.getName() + "</name>" + "\n" +
                "    <weight>" + toucan.getWeight() + "</weight>" + "\n" +
                "</toucan>";
    }

    @Override
    public String visitOwl(Owl owl) {
        //xml source with data of owl object
        return "<toucan>" + "\n" +
                "    <age>" + owl.getAge() + "</age>" + "\n" +
                "    <name>" + owl.getName() + "</name>" + "\n" +
                "    <weight>" + owl.getWeight() + "</weight>" + "\n" +
                "</toucan>";
    }

}
