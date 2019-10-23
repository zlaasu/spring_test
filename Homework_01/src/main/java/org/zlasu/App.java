package org.zlasu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zlasu.customer.SimpleCustomerLogger;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        //TAST 2
        SimpleCustomerLogger simpleCustomerLogger = context.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
        simpleCustomerLogger.log();
    }
}
