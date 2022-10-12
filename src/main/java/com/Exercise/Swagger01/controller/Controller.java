package com.Exercise.Swagger01.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name")
    @ApiOperation(value = "Get name of Developer", notes = "The name of Developer")
    public String getName() {
        return "Mirko";
    }




}
