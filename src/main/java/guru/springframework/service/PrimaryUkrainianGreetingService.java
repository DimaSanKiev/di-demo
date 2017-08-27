package guru.springframework.service;

public class PrimaryUkrainianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryUkrainianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getUkrainianGreeting();
    }
}
