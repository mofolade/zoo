package com.example.zooApp.controllers;

import com.example.zooApp.entities.Image;
import com.example.zooApp.entities.ProxyImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ProxyPatternController {

    /*@GetMapping(value = "classpath", produces = MediaType.IMAGE_JPEG_VALUE)
    public void fromClasspathAsHttpServResp(HttpServletResponse response) throws IOException {

        ClassPathResource imageFile = new ClassPathResource("image/orkide.jpg");

        StreamUtils.copy(imageFile.getInputStream(), response.getOutputStream());
    }*/
    @RequestMapping(value = "flower")
    public String display(Model model) {
        Image image = new ProxyImage("/images/tulip.jpg");
        System.out.println(image.display());
        //Image will be loaded from map.
        model.addAttribute("imageUrl", image.display());
        //Image will not be loaded from map.
        model.addAttribute("imageUrl2", image.display());
        return "flower";
        //System.out.println("");
        //image.display();*/

    }

}
