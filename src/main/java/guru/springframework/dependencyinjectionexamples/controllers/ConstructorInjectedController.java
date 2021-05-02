package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;

/**
 * Created by Gowtham C on 02/05/21.
 */
public class ConstructorInjectedController {

  private final GreetingService greetingService;


  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
