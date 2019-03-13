package com.lgw.feign;

import com.lgw.feign.client.SchedualServiceIsLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private SchedualServiceIsLogin schedualServiceIsLogin;
    @RequestMapping(value = "/examination",method = RequestMethod.GET)
    public String isLogin(@RequestParam String name){
        return  schedualServiceIsLogin.IsLoginFromClientOne(name);
    }
}
