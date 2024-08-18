package config;

import impl.CourseService;
import impl.JavaCourse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public JavaCourse javaCourse()
    {
        return new JavaCourse(1,"JavaCourse",15000);
    }

    @Bean
    public CourseService courseService()
    {
        return new CourseService("CourseService",javaCourse());
    }




}
