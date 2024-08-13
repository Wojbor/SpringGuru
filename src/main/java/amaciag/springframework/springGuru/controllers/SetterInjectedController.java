package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
