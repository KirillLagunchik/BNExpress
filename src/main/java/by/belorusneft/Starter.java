package by.belorusneft;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Starter {

    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BNExpressConfiguration.class);
        context.refresh();
    }
}