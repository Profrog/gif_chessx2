package com.profrog.chessx2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontend {

    @GetMapping(value = "/")
    public String mainpage() {
        return "main";
    }

    @GetMapping(value = "/ptg")
    public String ptgpage() {
        return "pgntogif";
    }

    @GetMapping(value = "/about")
    public String aboutpage() {
        return "about";
    }
}
