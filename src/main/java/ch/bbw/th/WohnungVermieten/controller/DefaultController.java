package ch.bbw.th.WohnungVermieten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/house")
    public String requestHouse(){
        return "house";
    }

    @RequestMapping("/room")
    public String requestRoom(){
        return "room";
    }

    @RequestMapping("/rent")
    public String requestRent(){
        return "rent";
    }

    @RequestMapping("/contact")
    public String requestContact(){
        return "contact";
    }
}
