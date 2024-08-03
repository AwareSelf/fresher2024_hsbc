package nama.security.springsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecuritydemoApplication {

	public static void main(String[] args) {
		System.out.println("Spring security in-memory authentication authorization demo..");
		SpringApplication.run(SpringsecuritydemoApplication.class, args);
	}

}
