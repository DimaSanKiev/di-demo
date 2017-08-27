package guru.springframework.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {


    @Override
    public String getEnglishGreeting() {
        return "Hello from PrimaryGreetingService";
    }

    @Override
    public String getGermanGreeting() {
        return "Viele Grüße von PrimaryGreetingService";
    }

    @Override
    public String getUkrainianGreeting() {
        return "Привіт від PrimaryGreetingService";
    }
}
