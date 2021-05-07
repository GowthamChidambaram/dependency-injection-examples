package guru.springframework.dependencyinjectionexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 02/05/21.
 */
@Profile("SP")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "hello world ---- SP";
  }
}
