package guru.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "I was injected via the constructor.";
    }
}
