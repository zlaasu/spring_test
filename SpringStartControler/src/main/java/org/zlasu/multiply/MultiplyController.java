package org.zlasu.multiply;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String formGetAction(Model model, @RequestParam(defaultValue="10") int size) {
        model.addAttribute("size", size);
        return "multiply";
    }
}
