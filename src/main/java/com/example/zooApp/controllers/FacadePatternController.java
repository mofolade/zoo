package com.example.zooApp.controllers;
import com.example.zooApp.entities.BirdKeeper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class FacadePatternController {

    @RequestMapping("/birds")
    public static String showBird(Model model) {
        //birdkeeper creates an owl and a toucan object
        BirdKeeper bird=new BirdKeeper();

        //add object properties to html
        model.addAttribute("birdOwl", bird.owlPresentation());
        model.addAttribute("birdToucan", bird.toucanPresentation());

        //html page with data
        return "birds";
    }

}
