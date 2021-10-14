package by.belorusneft;

import by.belorusneft.services.EmailLoginService;
import by.belorusneft.services.EmailLoginServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
public class BNExpressConfiguration {
    @Bean
    EmailLoginService emailLoginService() {
        return new EmailLoginServiceImpl();
    }
}
