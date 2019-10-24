package org.zlasu.header;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String showUserAgentAction(Model model, @RequestHeader("User-Agent") String userAgent) {
        model.addAttribute("userAgent", userAgent);

        return "showUserAgent";
    }
}
