package guru.springframework.dependencyinjectionexamples.services;

import org.springframework.stereotype.Component;

/**
 * Created by Gowtham C on 16/05/21.
 */
@Component
public class SingletonBean {

  public SingletonBean() {
    System.out.println("Creating singleton....!!!!");
  }

  public String getScope(){
    return "I m a singleton";
  }
}
