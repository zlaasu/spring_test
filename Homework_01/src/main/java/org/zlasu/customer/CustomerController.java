package org.zlasu.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    private final SimpleCustomerLogger simpleCustomerLogger;

    public CustomerController(SimpleCustomerLogger simpleCustomerLogger) {
        this.simpleCustomerLogger = simpleCustomerLogger;
    }

    @GetMapping("/task2")
    @ResponseBody
    public String helloWorldAction() {
        simpleCustomerLogger.log();

        return "";
    }
}
