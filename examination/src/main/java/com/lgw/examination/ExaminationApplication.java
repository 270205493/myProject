package com.lgw.examination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ExaminationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminationApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/examination")
	public String isLogin(@RequestParam(value = "name", defaultValue = "lgw")String name){
		Boolean boo = true;
		if("lgw".equals(name)){
			boo = true;
		}else{
			boo = false;
		}
		return name+"-"+port+"-"+boo;
	}

}
