package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;


    public String sayHello() {
        return greetingService.sayHello();
    }
}
