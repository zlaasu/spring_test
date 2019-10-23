package org.zlasu.random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping(path = "/random", produces = "text/html; charset=UTF-8")
    //@RequestMapping(path = "/random", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandomAction() {
        Random random = new Random();
        return "Wylosowano liczbę:" + random.nextInt();
    }
}
