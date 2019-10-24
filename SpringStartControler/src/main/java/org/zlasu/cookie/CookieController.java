package org.zlasu.cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @RequestMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookieAction(HttpServletResponse response, @PathVariable String value1,
                                  @PathVariable String value2) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);

        cookie1.setPath("/");
        cookie2.setPath("/");

        response.addCookie(cookie1);
        response.addCookie(cookie2);

        return "Cookies";
    }

    @RequestMapping("/getcookies1")
    @ResponseBody
    public String getCookieAction(HttpServletRequest request) {
        Cookie cookie1 = WebUtils.getCookie(request, "cookie1");
        Cookie cookie2 = WebUtils.getCookie(request, "cookie2");

        System.out.println("cookie1: " + cookie1.getValue());
        System.out.println("cookie2: " + cookie2.getValue());

        return "Cookies";
    }


    @RequestMapping("/getcookies2")
    @ResponseBody
    public String getCookieAction2(@CookieValue("cookie1") String cookie1,
                                   @CookieValue("cookie2") String cookie2) {

        System.out.println("cookie1: " + cookie1);
        System.out.println("cookie2: " + cookie2);

        return "Cookies";
    }
}
