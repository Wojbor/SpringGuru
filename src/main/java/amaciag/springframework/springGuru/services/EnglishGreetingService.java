package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - ENGLISH Greeting Service";
    }
}
