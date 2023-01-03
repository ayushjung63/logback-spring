package com.ayush.logbackdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home(){
        for (int i=0; i<10000;i++) {
            if (i%2==0) {
                logger.error("ERRR: EVEN NUMBER",i, HomeController.class.getSimpleName());
            }else {
                logger.info("INFO : Odd Number", HomeController.class.getSimpleName());
            }
        }
        logger.info("Loop Finished ");
        logger.error("ERROR");
        return "Hello World";
    }
}
