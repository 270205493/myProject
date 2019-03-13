package com.lgw.examination1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Examination1Application {

	public static void main(String[] args) {
		SpringApplication.run(Examination1Application.class, args);
	}

	@RequestMapping("/examination")
	public String isLogin(@RequestParam(value = "name",defaultValue = "lgw")String name){
		Boolean boo = false;
		if("lgw".equals(name))
			boo = true;
		return name+"-8763-"+boo;
	}

}
