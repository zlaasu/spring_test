package org.zlasu.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String showUserAgent() {
        return "hello";
    }
}
