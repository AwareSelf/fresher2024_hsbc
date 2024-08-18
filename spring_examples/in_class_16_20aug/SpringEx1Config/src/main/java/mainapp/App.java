package mainapp;

import config.MyConfig;
import intf.CourseIntf;
import intf.ServiceIntf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ServiceIntf ref = (ServiceIntf) context.getBean("courseService");
        System.out.println(ref.getServiceName());
        System.out.println(ref.getCourse().getCourseName());

        ServiceIntf ref1 = (ServiceIntf) context.getBean("courseService");
        System.out.println(ref==ref1);

    }
}
