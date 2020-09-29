package com.example.zooApp.controllers;

import com.example.zooApp.entities.Factory;
import com.example.zooApp.entities.Birds;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FactoryPatternController {

    @GetMapping("/birdsfactory")
    public String showBirds() {
        Factory factory = new Factory();

        //get an object of Birds
        Birds bird = factory.getBirds("Owl");

        //get an object of Birds
        Birds bird2 = factory.getBirds("Toucan");

        return bird.eatReptiles() + "<br>" + bird2.eatReptiles();
    }
}
