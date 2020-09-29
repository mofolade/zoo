package com.example.zooApp.controllers;

import com.example.zooApp.entities.Image;
import com.example.zooApp.entities.Area;
import com.example.zooApp.entities.ProxyImage;
import com.example.zooApp.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class ProxyPatternController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "areaimage")
    public String display(Model model) {
        List<Area> areas = areaService.getAllAreas();
        int size = areas.size();
        int random = (int)(Math.random() * (size - 1 + 1) + 0);
        Area area = areas.get(random);
        Image image = new ProxyImage(area.getImagePath());
        System.out.println(image.display());
        //Image will be loaded from map.
        model.addAttribute("imageUrl", image.display());
        //Image will not be loaded from map.
        model.addAttribute("imageUrl2", image.display());

        //System.out.println(random);
        return "areaimage";
        //System.out.println("");
        //image.display();*/

    }
}
