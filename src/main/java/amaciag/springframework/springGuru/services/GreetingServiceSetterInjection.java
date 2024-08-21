package amaciag.springframework.springGuru.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from GreetingServiceSetterInjection";
    }
}
