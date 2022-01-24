package com.groupware.planet.cobti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cobti")
public class CobtiController {

    @GetMapping
    public String cobti(){
        return "cobti/cobti";
    }
}
