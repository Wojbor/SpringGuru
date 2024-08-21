package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingPrimaryService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from primary bean service";
    }
}
