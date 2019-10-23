package org.zlasu.freetime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class FreeTimeController {

    @GetMapping(path = "/free-time", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandomAction() {
        LocalDateTime date = LocalDateTime.now();

        if ((date.getDayOfWeek().toString().equalsIgnoreCase("saturday"))
            || date.getDayOfWeek().toString().equalsIgnoreCase("sunday")) {
            return "WOLNE";
        }

        if ((date.getHour() < 17)) {
            return "Pracuje, nie dzwoń";
        }

        return "Po Pracy";
    }
}
