package by.belorusneft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailLoginController {

    @RequestMapping("/email-login")
    public String showEmailLoginPage() {
        return "emailLogin";
    }
}
