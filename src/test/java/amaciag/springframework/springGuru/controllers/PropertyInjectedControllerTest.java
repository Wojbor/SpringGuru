package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}