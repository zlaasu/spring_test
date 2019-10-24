package org.zlasu.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/login")
    @ResponseBody
    public String loginStartAction(HttpSession session) {
        String loginStart = (String) session.getAttribute("loginStart");

        if (loginStart == null) {
            session.setAttribute("loginStart", LocalDateTime.now().toString());
        }

        return loginStart;
    }
}