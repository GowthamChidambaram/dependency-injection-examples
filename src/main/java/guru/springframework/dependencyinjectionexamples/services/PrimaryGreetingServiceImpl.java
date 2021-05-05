package guru.springframework.dependencyinjectionexamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 05/05/21.
 */

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{


  @Override
  public String sayGreeting() {
    return "hello world - from primary bean";

  }
}
