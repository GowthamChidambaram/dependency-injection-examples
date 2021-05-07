package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gowtham C on 02/05/21.
 */
class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;

  @BeforeEach
  void setUp() {

    propertyInjectedController = new PropertyInjectedController();

    propertyInjectedController.greetingService = new PropertyGreetingServiceImpl();


  }

  @Test
  void sayGreeting() {

    System.out.println(propertyInjectedController.sayHello());
  }
}