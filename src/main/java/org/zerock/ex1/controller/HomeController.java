package org.zerock.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
