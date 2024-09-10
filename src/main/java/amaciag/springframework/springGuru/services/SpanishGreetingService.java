package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mucho Gusto - Spanish Greeting Service";
    }
}
