package guru.springframework.dependencyinjectionexamples;

import guru.springframework.dependencyinjectionexamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

  public static void main(String[] args) {

    ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

    MyController myController = (MyController) applicationContext.getBean("myController");

    String greetings = myController.sayHello();

    System.out.println(greetings);
  }

}