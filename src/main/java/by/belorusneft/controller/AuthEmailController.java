package by.belorusneft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthEmailController {

    @RequestMapping("/auth-email")
    public String showAuthEmail() {
        return "authEmail";
    }

}
