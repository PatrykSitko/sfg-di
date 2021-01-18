package be.intecbrussel.patryksitko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.intecbrussel.patryksitko.sfgdi.services.PropertyInjectedGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setup() throws Exception {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new PropertyInjectedGreetingService();
    }

    @Test
    void getGreeting() throws Exception {
        System.out.println(propertyInjectedController.getGreeting());
    }
}
