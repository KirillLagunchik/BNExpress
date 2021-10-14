package by.belorusneft.services;

import by.belorusneft.entity.EmailLoginRequest;
import by.belorusneft.entity.EmailLoginResponse;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class EmailLoginServiceImpl implements EmailLoginService {

    static final String url = "http://rl-erc-test.it.beloil.by:8027/rcp2/billing/api/public/Login/Email";

    public EmailLoginResponse emailLoginHttpRequest(String email) {
        EmailLoginRequest emailLoginRequest = new EmailLoginRequest();
        emailLoginRequest.setPartnerEmailAddress(email);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<EmailLoginRequest> requestBody = new HttpEntity<>(emailLoginRequest);

        //ResponseEntity<EmailLoginResponse> response = restTemplate.exchange(url, HttpMethod.POST, requestBody, EmailLoginResponse.class);
        EmailLoginResponse response = restTemplate.postForObject(url, requestBody, EmailLoginResponse.class);

        return response;
    }
}
