package org.zlasu.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String showUserAgent(@RequestHeader("User-Agent") String userAgent) {
        System.out.println(userAgent);
        return "hello";
    }
}
