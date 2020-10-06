package com.example.zooApp.controllers;

import com.example.zooApp.entities.Factory;
import com.example.zooApp.entities.Birds;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class FactoryPatternController {

    @RequestMapping(value = "/birdsfactory")
    public String showBirds(Model model) {
        Factory factory = new Factory();

        //get an object of Birds
        Birds birdOwl = factory.getBirds("Owl");

        //get an object of Birds
        Birds birdToucan = factory.getBirds("Toucan");

        //add object properties to html
        model.addAttribute("birdOwl", birdOwl.eatReptiles());
        model.addAttribute("birdToucan", birdToucan.eatReptiles());

        // html page with data
        return "birdsfactory";
    }
}
