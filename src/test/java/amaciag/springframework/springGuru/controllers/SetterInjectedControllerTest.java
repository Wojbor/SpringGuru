package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {


    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}