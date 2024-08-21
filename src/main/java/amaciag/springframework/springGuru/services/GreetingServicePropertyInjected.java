package amaciag.springframework.springGuru.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayHello() {
        return "Friends don't let friends to property injection!!!!!";
    }
}
