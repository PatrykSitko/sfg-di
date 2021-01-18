package be.intecbrussel.patryksitko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.intecbrussel.patryksitko.sfgdi.services.PropertyInjectedGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setup() throws Exception {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new PropertyInjectedGreetingService());
    }

    @Test
    void getGreeting() throws Exception {
        System.out.println(setterInjectedController.getGreeting());
    }
}
