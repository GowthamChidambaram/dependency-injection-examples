package guru.springframework.dependencyinjectionexamples.services;

import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 02/05/21.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "hello world";
  }
}
