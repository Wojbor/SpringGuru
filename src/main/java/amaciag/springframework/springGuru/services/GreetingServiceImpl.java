package amaciag.springframework.springGuru.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Everyone from Base Service";
    }
}
