package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ua")
public class PrimaryUkrainianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Привіт від PrimaryGreetingService";
    }
}
