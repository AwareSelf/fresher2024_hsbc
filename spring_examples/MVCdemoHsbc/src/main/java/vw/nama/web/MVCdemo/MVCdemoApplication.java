package vw.nama.web.MVCdemo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vw.nama.web.MVCdemo.model.Employee;


@SpringBootApplication
public class MVCdemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MVCdemoApplication.class, args);
	}

}
