package com.example.YellowTeamServer.app;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

/**
 *
 * @author olive
 */
public class ApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "This works and is not total shit";
    }
}
