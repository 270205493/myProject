package com.lgw.ribbon.controller;

import com.lgw.ribbon.service.LoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @Autowired
    LoadBalance service;

    @GetMapping(value = "/banlance")
    public String testBanlance(@RequestParam String name){
        return service.testBanlance(name);
    }
}
