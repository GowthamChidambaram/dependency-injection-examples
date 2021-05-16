package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Gowtham C on 07/05/21.
 */
@Controller
public class I18nController {

  private final GreetingService greetingService;


  public I18nController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayGreeting();
  }

}



