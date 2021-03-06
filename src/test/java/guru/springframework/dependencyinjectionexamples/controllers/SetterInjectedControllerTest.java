package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gowtham C on 02/05/21.
 */
class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {

    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new SetterGreetingServiceImpl());
  }

  @Test
  void sayGreeting() {

    System.out.println(setterInjectedController.sayHello());
  }
}