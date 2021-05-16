package guru.springframework.dependencyinjectionexamples.services;

import guru.springframework.dependencyinjectionexamples.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 02/05/21.
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

  private final EnglishGreetingRepository englishGreetingRepository;

  public I18nEnglishGreetingServiceImpl(EnglishGreetingRepository englishGreetingRepository) {
    this.englishGreetingRepository = englishGreetingRepository;
  }



  @Override
  public String sayGreeting(){
    return englishGreetingRepository.getGreeting();
  }
}
