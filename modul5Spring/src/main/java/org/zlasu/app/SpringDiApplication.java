package org.zlasu.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zlasu.beans.HelloWorld;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        //Task2
        System.out.println("TASK 2");
        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
        System.out.println(hello.getMessage());
        System.out.println();

        //Task 3
        System.out.println("TASK 3");
        EmailService emailService = context.getBean("serviceEmail", EmailService.class);
        emailService.send();
        System.out.println();

        //Task 4
        System.out.println("TASK 4");
        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        System.out.println();

        //Task 5
        System.out.println("TASK 5");
        MessageSender messageSender5 = context.getBean("messageSender5", MessageSender.class);
        messageSender5.sendMessageFromProperty();
        System.out.println();

        context.close();
    }
}
