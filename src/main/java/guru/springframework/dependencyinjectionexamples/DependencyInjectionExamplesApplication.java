package guru.springframework.dependencyinjectionexamples;

import com.sun.tools.internal.jxc.ap.Const;
import guru.springframework.dependencyinjectionexamples.controllers.ConstructorInjectedController;
import guru.springframework.dependencyinjectionexamples.controllers.MyController;
import guru.springframework.dependencyinjectionexamples.controllers.PropertyInjectedController;
import guru.springframework.dependencyinjectionexamples.controllers.SetterInjectedController;
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

    System.out.println("--------Property---------");
    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
    System.out.println(propertyInjectedController.sayGreeting());


    System.out.println("--------Settter---------");
    SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
    System.out.println(setterInjectedController.sayGreeting());

    System.out.println("--------Constructor---------");
    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.sayGreeting());
  }

}
