package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gowtham C on 02/05/21.
 */
class ConstructorInjectedControllerTest {

  ConstructorInjectedController constructorInjectedController;

  @BeforeEach
  void setUp() {
    constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
  }

  @Test
  void sayGreeting() {

    System.out.println(constructorInjectedController.sayHello());
  }
}