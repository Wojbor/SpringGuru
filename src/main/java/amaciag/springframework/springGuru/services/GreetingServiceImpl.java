package amaciag.springframework.springGuru.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Everyone from Base Service";
    }
}
