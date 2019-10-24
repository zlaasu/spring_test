package org.zlasu.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
    public String random(@PathVariable int max, @PathVariable int min) {
        Random random = new Random();
        int i = random.nextInt(max - min) + min + 1;

        return "random: " + i;
    }

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String random(@PathVariable String firstName, @PathVariable String lastName) {
        return "Witaj " + firstName + " " + lastName;
    }

    @GetMapping("/form")
    public String formGetAction() {
        return "task3GET";
    }

    @PostMapping("/form")
    public String formPostAction(Model model, @RequestParam String paramName) {
        model.addAttribute("paramName", paramName);
        return "task3POST";
    }

    @GetMapping("/helloView")
    public String home(Model model) {
        String backgroudColor = "black";
        String color = "white";

        int hour = LocalDateTime.now().getHour();

        if (hour > 8 && hour < 20) {
            backgroudColor = "white";
            color = "black";
        }

        model.addAttribute("backgroudColor", backgroudColor);
        model.addAttribute("color", color);
        return "home";
    }
}
