package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;

/**
 * Created by Gowtham C on 02/05/21.
 */
public class SetterInjectedController {

  private GreetingService greetingService;


  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
