package guru.springframework.dependencyinjectionexamples.repositories;

import org.springframework.stereotype.Repository;

/**
 * Created by Gowtham C on 16/05/21.
 */
@Repository
public interface EnglishGreetingRepository {

  String getGreeting();
}
