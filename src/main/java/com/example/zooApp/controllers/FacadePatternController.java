package com.example.zooApp.controllers;
import com.example.zooApp.entities.BirdKeeper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FacadePatternController {

    @GetMapping("/birds")
    public static String showBird() {
        BirdKeeper bird=new BirdKeeper();

        return bird.toucanPresentation()+"<br>"+bird.owlPresentation();

    }

}
