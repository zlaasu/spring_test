package org.zlasu.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorldAction() {
        return "Hello World";
    }

    @GetMapping("/random/{max}/{min}")
    @ResponseBody
    public String random(@PathVariable int max) {
        Random random = new Random();
        int i = random.nextInt(max) + 1;

        return "random: " + i;
    }
}
