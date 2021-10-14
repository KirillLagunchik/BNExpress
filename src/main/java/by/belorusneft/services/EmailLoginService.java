package by.belorusneft.services;

import by.belorusneft.entity.EmailLoginResponse;

public interface EmailLoginService {
    EmailLoginResponse emailLoginHttpRequest(String email);
}
