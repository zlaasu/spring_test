package org.zlasu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zlasu.customer.Customer;
import org.zlasu.customer.MemoryCustomerRepository;
import org.zlasu.customer.SimpleCustomerLogger;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        //TASK 2
        SimpleCustomerLogger simpleCustomerLogger = context.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
        simpleCustomerLogger.log();
        System.out.println();

        //TASK 3
        MemoryCustomerRepository memoryCustomerRepository = context.getBean("memoryCustomerRepository",
                MemoryCustomerRepository.class);
        memoryCustomerRepository.addCustomer(new Customer());

    }
}
