package com.nama.springboot.restservicedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nama.springboot.restservicedemo.restcontroller.EmpRestContoller;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class RestservicedemoApplication {

	public static void main(String[] args) {


		SpringApplication.run(RestservicedemoApplication.class, args);
	}

}
