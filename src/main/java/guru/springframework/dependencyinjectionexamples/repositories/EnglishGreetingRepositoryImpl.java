package guru.springframework.dependencyinjectionexamples.repositories;

import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 16/05/21.
 */
@Service
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
  @Override
  public String getGreeting() {
    return "hello world ---- EN";
  }
}
