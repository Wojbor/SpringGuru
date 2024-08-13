package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;


    public String sayHello() {
        return greetingService.sayHello();
    }
}
