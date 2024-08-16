package vw.nama.springboot.springbootdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import vw.nama.springboot.springbootdemo1.configuration.EmployeeConfiguration;
import vw.nama.springboot.springbootdemo1.model.Employee;

//@SpringConfiguration,@EnableAutoConfiguration,@ComponentScan
@ComponentScan(basePackages = { "restcontrollers","vw.nama.springboot.springbootdemo1"})
@SpringBootApplication
@EnableConfigurationProperties(EmployeeConfiguration.class)
public class Springbootdemo1Application implements CommandLineRunner {
	
	@Value("${server.port}")
	int port;
	
	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("application is running on server port:"+port);
		System.out.println("inside run method of spring boot application");
	}

}

//Spring Framework
//Spring Boot Project