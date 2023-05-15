package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class welcomeController {

    @GetMapping(path = "/welcome")
    public String getwelcome(){
        return "welcomeController";
    }


    @GetMapping(path = "/name")
    public String getname(){
        return "MY NAME IS MAYAR";
    }

    @GetMapping(path = "/age")
    public String getaeg(){
        return "MY AGE IS 21";
    }

    @GetMapping(path = "/check/status")
    public String getcheck(){
        return "Everything ok";

    }
    @GetMapping(path = "/health")
    public String gethealth(){
        return "Server health is up and running";

    }

}


