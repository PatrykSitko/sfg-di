package be.intecbrussel.patryksitko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.intecbrussel.patryksitko.sfgdi.services.PropertyInjectedGreetingService;

public class ContructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() throws Exception {
        constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedGreetingService());
    }

    @Test
    void getGreeting() throws Exception {
        System.out.println(constructorInjectedController.getGreeting());
    }
}
