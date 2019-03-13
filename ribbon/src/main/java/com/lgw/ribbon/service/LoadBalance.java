package com.lgw.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoadBalance {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "logError")
    public String testBanlance(String name){
        return restTemplate.getForObject("http://examination/examination?name="+name,String.class);
    }

    public String logError(String name){
        return name+"log error！";
    }

}
