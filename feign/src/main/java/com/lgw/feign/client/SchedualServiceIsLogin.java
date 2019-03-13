package com.lgw.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "examination")
public interface SchedualServiceIsLogin {
    @RequestMapping(value = "/examination",method = RequestMethod.GET)
    String IsLoginFromClientOne(@RequestParam(value = "name")String name);
}
