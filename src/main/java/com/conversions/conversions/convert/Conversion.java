package com.conversions.conversions.convert;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conversion {

    @RequestMapping("/ktoc")
    public double KelvinToCelsius(){
        return 13.23;
    }
}
