package guru.springframework.dependencyinjectionexamples.controllers;

import guru.springframework.dependencyinjectionexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Gowtham C on 02/05/21.
 */
@Controller
public class PropertyInjectedController {

  @Qualifier("propertyGreetingServiceImpl")
  @Autowired
  public GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
