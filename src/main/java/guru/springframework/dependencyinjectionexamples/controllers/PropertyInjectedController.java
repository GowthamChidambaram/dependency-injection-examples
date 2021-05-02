package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;

/**
 * Created by Gowtham C on 02/05/21.
 */
public class PropertyInjectedController {

  public GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
