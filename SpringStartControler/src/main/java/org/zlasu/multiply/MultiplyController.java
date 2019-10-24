package org.zlasu.multiply;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String formGetAction(Model model, @RequestParam(defaultValue = "10") int size) {
        model.addAttribute("rows", size);
        model.addAttribute("cols", size);
        return "multiply";
    }

    @GetMapping("/paramMultiply/{rows}/{cols}")
    public String formGetAction(Model model, @PathVariable int rows, @PathVariable int cols) {
        model.addAttribute("rows", rows);
        model.addAttribute("cols", cols);
        return "multiply";
    }
}
