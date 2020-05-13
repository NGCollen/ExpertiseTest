package com.conversions.conversions.convert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Conversion {

    @RequestMapping(method = RequestMethod.GET, path = "/conversions/ktoc")
    public Float KelvinToCelsius(@PathParam("kelvin") Float kelvin){
        Float celsius = kelvin - 273.15F;
      return celsius;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/conversions/ctok")
    public Float CelsiusToKelvin(@PathParam("celsius") Float celsius){
        Float kelvin = celsius + 273.15F;
        return kelvin;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/conversions/mtok")
    public Double MilesToKiloMetres(@PathParam("miles") Double miles){
        Double kilometres = (miles * 1.60934d);
        return kilometres;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/conversions/ktom")
    public Double KiloMetresToMiles(@PathParam("miles") Double kilometres){
        Double miles = (kilometres * 0.621371d);
        return miles;
    }
}
