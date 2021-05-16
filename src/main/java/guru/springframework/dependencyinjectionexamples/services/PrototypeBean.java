package guru.springframework.dependencyinjectionexamples.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Gowtham C on 16/05/21.
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

  public PrototypeBean() {
    System.out.println(" creating a prototypebean....!!!");
  }

  public String getScope(){
    return "I m a protype";
  }

}
