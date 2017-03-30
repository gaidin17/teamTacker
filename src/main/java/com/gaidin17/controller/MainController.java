package com.gaidin17.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gaidin on 11.02.2017.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String helloWorld(@RequestParam("sessionId") int pid, @RequestParam("sessionId") float px, @RequestParam("sessionId") float py, @RequestParam("sessionId") long ptime) {

        return "string";
    }
}
