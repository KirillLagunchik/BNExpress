package by.belorusneft.controller;

import by.belorusneft.entity.EmailLoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthEmailController {

    @RequestMapping(value = "/auth-email", method = RequestMethod.GET)
    public String showAuthEmail() {
        return "authEmail";
    }

    @RequestMapping(value = "/auth-email", method = RequestMethod.POST)
    public String authEmail(@ModelAttribute("email") EmailLoginRequest email, BindingResult result,
                            ModelMap model) {
        model.addAttribute("email", email);
        return "";
    }

}
