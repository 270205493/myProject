package com.lgw.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoadBalance {
    @Autowired
    RestTemplate restTemplate;

    public String testBanlance(String name){
        return restTemplate.getForObject("http://examination/examination?name="+name,String.class);
    }

}
