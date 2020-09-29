package com.example.zooApp.controllers;

import com.example.zooApp.entities.Factory;
import com.example.zooApp.entities.Birds;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        model.addAttribute("birdOwl", birdOwl.eatReptiles());
        model.addAttribute("birdToucan", birdToucan.eatReptiles());

        return "birdsfactory"; //bird.eatReptiles() + "<br>" + bird2.eatReptiles();
    }
}
