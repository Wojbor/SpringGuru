package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("setGreetingService");
        this.greetingService = greetingService;
    }
}
