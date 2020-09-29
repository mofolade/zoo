package com.example.zooApp.controllers;

import com.example.zooApp.entities.Lion;
import com.example.zooApp.entities.Mammal;
import com.example.zooApp.entities.Monkey;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class BehavioralTemplateController {

    @RequestMapping(value = "/mammals")
    public String showMammal(Model model) {
        var lion = new Lion("Leo","Africa","Height: 4 ft, Weight: 425 lb, Length: 5 ft - 8 ft");
        var monkey = new Monkey("Goliath","Asia","Height: 3.3 ft, Weight: 79 lb");

        model.addAttribute("lionText", lion.greet());
        model.addAttribute("lionDesc", lion.getDescription());
        model.addAttribute("lionNoise", lion.makeYourSpecialNoise());
        model.addAttribute("monkeyText", monkey.greet());
        model.addAttribute("monkeyDesc", monkey.getDescription());
        model.addAttribute("monkeyNoise", monkey.makeYourSpecialNoise());

        return "mammals";

        /*return "<b>"+lion.greet()+"</b>\n\n "+lion.makeYourSpecialNoise()+"<br>"+"<b>"+monkey.greet()+"</b>"+
                "\n "+monkey.makeYourSpecialNoise()+"<br>";
*/
    }
}
