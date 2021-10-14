package by.belorusneft.controller;

import by.belorusneft.entity.EmailLoginRequest;
import by.belorusneft.entity.EmailLoginResponse;
import by.belorusneft.servlet.EmailLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class EmailLoginController {

    @RequestMapping(value = "/email-login", method = RequestMethod.GET)
    public String showEmailLoginPage(Model model) {
        model.addAttribute("emailLoginRequest", new EmailLoginRequest());
        return "emailLogin";
    }

    @RequestMapping(value = "/email-login", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("emailLoginRequest") EmailLoginRequest emailLoginRequest,
                         BindingResult result,
                         ModelMap model) {
        if (result.hasErrors()) {
            return "errorPage";
        }
        model.addAttribute("emailLoginRequest", emailLoginRequest);
        //EmailLoginResponse response = EmailLoginService.emailLoginHttpRequest(emailLoginRequest.getPartnerEmailAddress());
        return "authEmail";
    }
}
