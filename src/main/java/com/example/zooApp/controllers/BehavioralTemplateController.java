package com.example.zooApp.controllers;

import com.example.zooApp.entities.Lion;
import com.example.zooApp.entities.Mammal;
import com.example.zooApp.entities.Monkey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class BehavioralTemplateController {
   /* @GetMapping("/addLion")
    public String sendForm(Lion lion) {
        return "addLion";
    }*/
    @GetMapping("/mammals")
    public String showMammal() {
        var lion = new Lion("Leo","Africa","Height: 4 ft, Weight: 425 lb, Length: 5 ft - 8 ft");
        var monkey = new Monkey("Goliath","Asia","Height: 3.3 ft, Weight: 79 lb");

        //Map<String, String, String> map = new HashMap<>();
        //map.put("Lion", lion.greet(), lion.makeYourSpecialNoise());
        //map.put("Monkey", monkey.greet(), monkey.makeYourSpecialNoise());


        // add model attribute
        //model.addAttribute("todos", map);
        //t=1&n=Leo&p=Africa&d=Height: 4 ft, Weight: 425 lb, Length: 5 ft - 8 ft
        //return "mammals";

        return "<b>"+lion.greet()+"</b>\n\n "+lion.makeYourSpecialNoise()+"<br>"+"<b>"+monkey.greet()+"</b>"+
                "\n "+monkey.makeYourSpecialNoise()+"<br>";

    }
}
