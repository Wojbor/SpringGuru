package amaciag.springframework.springGuru.controllers;

 import amaciag.springframework.springGuru.services.GreetingService;
import amaciag.springframework.springGuru.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayHello();
    }

}
