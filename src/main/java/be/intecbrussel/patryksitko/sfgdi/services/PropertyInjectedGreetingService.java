package be.intecbrussel.patryksitko.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        // TODO Auto-generated method stub
        return "hello - Property";
    }

}
