package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Gowtham C on 02/05/21.
 */
@Controller
public class ConstructorInjectedController {

  private final GreetingService greetingService;


  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
