package com.example.zooApp.controllers;

import com.example.zooApp.entities.Birds;
import com.example.zooApp.entities.Owl;
import com.example.zooApp.entities.Toucan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorPatternController {

    @GetMapping("/birdsxml")
    public static String showBird() {
        //new toucan and owl objects
        Toucan toucan = new Toucan(12, "Toucanoo", 500);
        Owl owl = new Owl(6, "Ronaldo", 300);
        //get xml source
        String xml = export(toucan, owl);
        //xml displayed in html
        return "<textarea rows=\"20\" cols=\"140\" style=\"border:none;\">\n" + xml+"\n" +
                "</textarea>";
    }

    private static String export(Birds... birds) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        return exportVisitor.export(birds);
    }
}
