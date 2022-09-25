package com.project1.PhysiqueFirstGym.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String Welcome(){
        return "Welcome to Physique First Gym";
    }
}
