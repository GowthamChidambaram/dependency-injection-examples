package guru.springframework.dependencyinjectionexamples.services;

/**
 * Created by Gowtham C on 02/05/21.
 */
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "hello world";
  }
}