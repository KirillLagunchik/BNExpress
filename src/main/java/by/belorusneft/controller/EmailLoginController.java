package by.belorusneft.controller;

import by.belorusneft.entity.EmailLoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class EmailLoginController {

    @RequestMapping("/email-login")
    public String showEmailLoginPage() {
        return "emailLogin";
    }

    @RequestMapping(value = "/postEmailLogin", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("email") String email, BindingResult result,
                         ModelMap model) {
        if (result.hasErrors()) {
            return "errorPage";
        }
        model.addAttribute("email", email);
        return "errorPage";
    }
}
