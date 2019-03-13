package com.lgw.feign.client;

import com.lgw.feign.SchedualServiceLogHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "examination",fallback= SchedualServiceLogHystrix.class)
public interface SchedualServiceIsLogin {
    @RequestMapping(value = "/examination",method = RequestMethod.GET)
    String IsLoginFromClientOne(@RequestParam(value = "name")String name);
}
