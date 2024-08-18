package mainapp;


import intf.ServiceIntf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("impl");
        context.refresh();

        ServiceIntf ref = (ServiceIntf) context.getBean("courseser");
        System.out.println(ref.getServiceName());
        System.out.println(ref.getCourse().getCourseName());

        ServiceIntf ref1 = (ServiceIntf) context.getBean("courseser");
        System.out.println(ref==ref1);

    }
}
